package main.blockchain;

import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;

import main.blockchain.block.data.Data;
import main.blockchain.block.header.Header;

public class Block 
{
    private int blockNo;
    private String hashCode;
	private String prevHashCode;
	
    private Header header;
	private Data data;

    public Block(int index, String previoushash, Header header, Data data)	{
    	
        this.blockNo = index; 
        this.prevHashCode = previoushash;
        
        this.header = header;
        this.data = data;
        
        this.hashCode = Block.calculateHash(this);
    }
    

    public int getBlockNo()			{	return this.blockNo;			}
    public String getHash()			{	return this.hashCode;			}
    public String getPreviousHash() {	return this.prevHashCode;		}
    public Header getHeader()		{	return this.header;				}
    public Data getData()   		{	return this.data;				}

    public String str()				{	return this.header.toString();	}
    
    public static String calculateHash(Block block)	{
        if(block != null)        {
            MessageDigest digest = null;
            try		{
                		digest = MessageDigest.getInstance("SHA-256");
            }
            catch(NoSuchAlgorithmException e)	{	return null;	}
    
            String txt = block.str();
            
            final byte bytes[] = digest.digest(txt.getBytes());
            final StringBuilder builder = new StringBuilder();
            
            for(final byte b : bytes)		{
                String hex = Integer.toHexString(0xff & b);
                if(hex.length() == 1)
                    builder.append('0');

                builder.append(hex);
            }
            return builder.toString();
        }
            return null;
    }
 
    
    public String toString()        {
		StringBuilder builder= new StringBuilder();
			builder.append("Block #").append(this.blockNo).append(" : ").
				append("[metaData : ").append(this.header).append(",").
				append(" previousHash : ").append(this.prevHashCode).append(",").
				append(" Hash : ").append(this.hashCode).append(",").	
				append(" Data : ").append(this.data).append("]");
		return builder.toString();
	}
}