package com.google.protobuf;

import java.io.IOException;

/* loaded from: classes4.dex */
public class h4 extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;
    private o5 unfinishedMessage;
    private boolean wasThrownFromInputStream;

    public h4(String str) {
        super(str);
        this.unfinishedMessage = null;
    }

    public static h4 invalidEndTag() {
        return new h4("Protocol message end-group tag did not match expected tag.");
    }

    public static h4 invalidTag() {
        return new h4("Protocol message contained an invalid tag (zero).");
    }

    public static h4 invalidUtf8() {
        return new h4("Protocol message had invalid UTF-8.");
    }

    public static g4 invalidWireType() {
        return new g4("Protocol message tag had invalid wire type.");
    }

    public static h4 malformedVarint() {
        return new h4("CodedInputStream encountered a malformed varint.");
    }

    public static h4 negativeSize() {
        return new h4("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static h4 parseFailure() {
        return new h4("Failed to parse the message.");
    }

    public static h4 recursionLimitExceeded() {
        return new h4("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public static h4 sizeLimitExceeded() {
        return new h4("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public static h4 truncatedMessage() {
        return new h4("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public boolean getThrownFromInputStream() {
        return this.wasThrownFromInputStream;
    }

    public o5 getUnfinishedMessage() {
        return this.unfinishedMessage;
    }

    public void setThrownFromInputStream() {
        this.wasThrownFromInputStream = true;
    }

    public h4 setUnfinishedMessage(o5 o5Var) {
        this.unfinishedMessage = o5Var;
        return this;
    }

    public IOException unwrapIOException() {
        return getCause() instanceof IOException ? (IOException) getCause() : this;
    }

    public h4(Exception exc) {
        super(exc.getMessage(), exc);
        this.unfinishedMessage = null;
    }

    public h4(String str, Exception exc) {
        super(str, exc);
        this.unfinishedMessage = null;
    }

    public h4(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.unfinishedMessage = null;
    }

    public h4(String str, IOException iOException) {
        super(str, iOException);
        this.unfinishedMessage = null;
    }
}
