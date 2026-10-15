package com.devpedrogo.mudulo_testes;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.jupiter.api.Test;

public class ListTest {

  @Test
  void testMockingList_When_SizeIsCalled_ShouldReturn10(){

    //Given
    List<?> list = mock(List.class);
    
    // When
    when(list.size()).thenReturn(10);

    // Then
    assertEquals(10, list.size());

  }

  @Test
  void testMockingList_When_SizeIsCalled_ShouldReturnMultipleValues(){

    //Given
    List<?> list = mock(List.class);

    // When
    when(list.size()).thenReturn(10).thenReturn(30).thenReturn(15);

    // Then
    assertEquals(10, list.size());
    assertEquals(30, list.size());
    assertEquals(15, list.size());

  }

  @Test
  void testMockingList_When_GetIsCalled_ShouldReturnPedro(){

    //Given
    var list = mock(List.class);

    // When
    when(list.get(0)).thenReturn("Pedro");
    // when(list.get(1)).thenReturn("Pedro");

    // Then
    assertEquals("Pedro", list.get(0));
    assertNull(list.get(1));

  }

  @Test
  void testMockingList_When_GetIsCalledWithArgumentMatcher_ShouldReturnPedro(){

    //Given
    var list = mock(List.class);

    // When
    // anyInt is like a matcher by the way
    when(list.get(anyInt())).thenReturn("Pedro");

    // Then
    assertEquals("Pedro", list.get(anyInt()));
  }

  @Test
  void testMockingList_When_ThrowsAnException(){

    //Given
    var list = mock(List.class);

    // When
    when(list.get(anyInt())).thenThrow(new RuntimeException("Exception"));

    // Then
    assertThrows(RuntimeException.class, () -> {
      list.get(anyInt());
    },
      () -> "Should have throw an RuntimeException"
    );
  }

}
