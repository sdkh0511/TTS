package Assignments;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CustomList<E> implements List<E> {
    private Object[] internal = {};
    // empty implementation methods

	

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		 // return false;
		if (internal.length != 0) {
	        return false;
	    } else {
	        return true;
	    }
		
	}
	
	@Override
	public int size() {
	    if (isEmpty()) {
	        return 0;
	    } else {
	        return internal.length;
	    }
	}
	
	@Override
	public E get(int index) {
	    return (E) internal[index];
	}
	
	@Override
	public boolean add(E element) {
		// TODO Auto-generated method stub
		 Object[] temp = Arrays.copyOf(internal, internal.length + 1);
		 temp[internal.length] = element;
		 internal = temp;
		 return true;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public E set(int index, E element) {
		// TODO Auto-generated method stub
		return null;
	}

	/*@Override
	public void add(int index, E element) {
		// TODO Auto-generated method stub
		
	}*/

	@Override
	public E remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator<E> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<E> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<E> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}
    
    
}
