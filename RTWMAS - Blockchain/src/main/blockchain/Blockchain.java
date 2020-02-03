package main.blockchain;

import java.util.List;

import main.blockchain.block.data.Data;
import main.blockchain.block.header.Header;

import java.util.ArrayList;

public class Blockchain 
{
    private List<Block> blocks = new ArrayList<>();

    public Blockchain()		{
    	//  create the first block
        Block b = new Block(0, null, new Header() , new Data());
        blocks.add(b);
    }

    
    public Block latestBlock()  {	return blocks.get(blocks.size()-1);		}
    
    public Block newBlock(Header header, Data data)	{
        Block latestBlock = latestBlock();
        return new Block(latestBlock.getBlockNo() + 1, latestBlock.getHash(), header, data);
    }

    public void addBlock(Block b)	{
        blocks.add(b);
    }

    public boolean isFirstBlockValid()	{
        Block firstBlock = blocks.get(0);
        
        if(firstBlock.getBlockNo() != 0)
            return false;
        
        if(firstBlock.getPreviousHash() != null)
            return false;
        
        if(firstBlock.getHash() == null || !Block.calculateHash(firstBlock).equals(firstBlock.getHash()))
            return false;
        
        return true;
    }

    public boolean isValidNewBlock(Block newBlock, Block previousBlock)		{
        if(newBlock != null && previousBlock != null)        {
            if(previousBlock.getBlockNo()+1 != newBlock.getBlockNo())
                return false;

            if(newBlock.getPreviousHash() == null || !newBlock.getPreviousHash().equals(previousBlock.getHash()))
                return false;

            if(newBlock.getHash() == null || !Block.calculateHash(newBlock).equals(newBlock.getHash()))
                return false;

            return true;
        }    
        return false;
    }

    public boolean isBlockChainValid()	{

        if(!isFirstBlockValid())
            return false;
        
        for(int i = 1; i<blocks.size(); i++)
        {
            Block currentBlock = blocks.get(i);
            Block previousBlock = blocks.get(i-1);
            if(!isValidNewBlock(currentBlock,previousBlock))
                return false;
        }
        
        return true;
    }

    public String toString()    {
        StringBuilder builder = new StringBuilder();
        for(Block block : blocks)
        {
            builder.append(block).append("\n");
        }
        
        return builder.toString();
    }
}
