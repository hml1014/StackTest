package exercise;

class FullStackException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public FullStackException() {
	    this("The Stack has reached maximum capacity.");
	  }

	  public FullStackException(String exception) {
	    super(exception);
	  }
}
