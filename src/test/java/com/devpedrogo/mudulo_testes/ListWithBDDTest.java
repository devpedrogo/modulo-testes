package com.devpedrogo.mudulo_testes;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static org.mockito.BDDMockito.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.util.List;

import org.junit.jupiter.api.Test;

public class ListWithBDDTest {

  @Test
  void testMockingList_When_SizeIsCalled_ShouldReturn10(){

    //Given
    List<?> list = mock(List.class);
    
    // When
    given(list.size()).willReturn(10);

    // Then
    assertThat(list.size(), is(10));

  }

  @Test
  void testMockingList_When_SizeIsCalled_ShouldReturnMultipleValues(){

    //Given
    List<?> list = mock(List.class);

    // When
    given(list.size()).willReturn(10).willReturn(30).willReturn(15);

    // Then
    assertThat(list.size(), is(10));
    assertThat(list.size(), is(30));
    assertThat(list.size(), is(15));

  }

  @Test
  void testMockingList_When_GetIsCalled_ShouldReturnPedro(){

    //Given
    var list = mock(List.class);

    // When
    given(list.get(0)).willReturn("Pedro");
    // given(list.get(1)).willReturn("Pedro");

    // Then
    assertThat(list.get(0), is("Pedro"));
    assertNull(list.get(1));

  }

  @Test
  void testMockingList_When_GetIsCalledWithArgumentMatcher_ShouldReturnPedro(){

    //Given
    var list = mock(List.class);

    // When
    // anyInt is like a matcher by the way
    given(list.get(anyInt())).willReturn("Pedro");

    // Then
    assertThat(list.get(anyInt()), is("Pedro"));
  }

  @Test
  void testMockingList_When_ThrowsAnException(){

    //Given
    var list = mock(List.class);

    // When
    given(list.get(anyInt())).willThrow(new RuntimeException("Exception"));

    // Then
    assertThrows(RuntimeException.class, () -> {
      list.get(anyInt());
    },
      () -> "Should have throw an RuntimeException"
    );
  }

}
