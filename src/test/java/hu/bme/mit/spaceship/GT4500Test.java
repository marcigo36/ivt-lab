package hu.bme.mit.spaceship;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

public class GT4500Test {

  private GT4500 ship;
  private TorpedoStore mts;
  private TorpedoStore mts2;

  @Before
  public void init(){

    mts = mock(TorpedoStore.class);
    mts2 = mock(TorpedoStore.class);


    this.ship = new GT4500(mts,mts2);
  }

  @Test
  public void fireTorpedos_Single_Success(){
    // Arrange

    when(mts.fire(1)).thenReturn(true);
    when(mts.isEmpty()).thenReturn(false);
    when(mts.getNumberOfTorpedos()).thenReturn(1);


    // Assert
    assertEquals(true, ship.fireTorpedos(FiringMode.SINGLE));
  }

  @Test
  public void fireTorpedos_All_Success(){
    // Arrange
    when(mts.fire(1)).thenReturn(true);
    when(mts.isEmpty()).thenReturn(false);
    when(mts.getNumberOfTorpedos()).thenReturn(1);
    when(mts2.fire(1)).thenReturn(true);
    when(mts2.isEmpty()).thenReturn(false);
    when(mts2.getNumberOfTorpedos()).thenReturn(1);

    // Act
    boolean result = ship.fireTorpedos(FiringMode.ALL);

    // Assert
    assertEquals(true, result);
  }

  public void fireLasers_Single_Success(){
    // Arrange

    when(mts.fire(1)).thenReturn(true);
    when(mts.isEmpty()).thenReturn(false);
    when(mts.getNumberOfTorpedos()).thenReturn(1);


    // Assert
    assertEquals(true, ship.fireLasers(FiringMode.SINGLE));
  }

  @Test
  public void fireLasers_All_Success(){
    // Arrange
    when(mts.fire(1)).thenReturn(true);
    when(mts.isEmpty()).thenReturn(false);
    when(mts.getNumberOfTorpedos()).thenReturn(1);
    when(mts2.fire(1)).thenReturn(true);
    when(mts2.isEmpty()).thenReturn(false);
    when(mts2.getNumberOfTorpedos()).thenReturn(1);

    // Act
    boolean result = ship.fireLasers(FiringMode.ALL);

    // Assert
    assertEquals(true, result);
  }

}
