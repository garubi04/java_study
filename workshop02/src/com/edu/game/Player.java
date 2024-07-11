package com.edu.game;

public class Player {
	private int currentGameCnt;
    private int currentWinCnt;
    private int currentLoseCnt;
    private int currentTieCnt;
    
	public int getCurrentGameCnt() {
		return currentGameCnt;
	}
	public void setCurrentGameCnt() {
		currentGameCnt++;
	}
	public int getCurrentWinCnt() {
		return currentWinCnt;
	}
	public void setCurrentWinCnt() {
		currentWinCnt++;
	}
	public int getCurrentLoseCnt() {
		return currentLoseCnt;
	}
	public void setCurrentLoseCnt() {
		currentLoseCnt++;
	}
	public int getCurrentTieCnt() {
		return currentTieCnt;
	}
	public void setCurrentTieCnt() {
		currentTieCnt++;
	}
	
    
	
}
