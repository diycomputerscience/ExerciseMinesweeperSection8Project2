package com.diycomputerscience.minesweeper;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.diycomputerscience.minesweeper.utils.MinesweeperUtilsTest;
import com.diycomputerscience.minesweeper.view.UIPersistenceTest;
import com.diycomputerscience.minesweeper.view.UITest;

@RunWith(Suite.class)
@SuiteClasses({ PointTest.class,
				BoardTest.class, 
				SquareTest.class,
				MinesweeperUtilsTest.class,
				FilePersistenceStrategyTest.class,
				UITest.class,
				UIPersistenceTest.class
				})
public class AllTests {

}
