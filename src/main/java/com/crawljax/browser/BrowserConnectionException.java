// Copyright 2010 Google Inc. All Rights Reserved.

package com.crawljax.browser;

/**
 * This {@link RuntimeException} is thrown when a {@link EmbeddedBrowser} lost connection to its
 * underlying implementation and so crashed.
 *
 * @version $Id$
 * @author slenselink@google.com (Stefan Lenselink)
 */
public class BrowserConnectionException extends RuntimeException {

	/**
	 * Create a new BrowserConnectionException based on a previous catched RuntimeException.
	 *
	 * @param exception
	 *            the original exception to wrap.
	 */
	public BrowserConnectionException(RuntimeException exception) {
		super(exception);
	}
}