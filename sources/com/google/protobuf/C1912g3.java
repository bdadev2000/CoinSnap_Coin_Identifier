package com.google.protobuf;

import java.io.IOException;

/* renamed from: com.google.protobuf.g3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1912g3 extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;
    private N3 unfinishedMessage;
    private boolean wasThrownFromInputStream;

    public C1912g3(String str) {
        super(str);
        this.unfinishedMessage = null;
    }

    public static C1912g3 invalidEndTag() {
        return new C1912g3("Protocol message end-group tag did not match expected tag.");
    }

    public static C1912g3 invalidTag() {
        return new C1912g3("Protocol message contained an invalid tag (zero).");
    }

    public static C1912g3 invalidUtf8() {
        return new C1912g3("Protocol message had invalid UTF-8.");
    }

    public static C1905f3 invalidWireType() {
        return new C1905f3("Protocol message tag had invalid wire type.");
    }

    public static C1912g3 malformedVarint() {
        return new C1912g3("CodedInputStream encountered a malformed varint.");
    }

    public static C1912g3 negativeSize() {
        return new C1912g3("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static C1912g3 parseFailure() {
        return new C1912g3("Failed to parse the message.");
    }

    public static C1912g3 recursionLimitExceeded() {
        return new C1912g3("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public static C1912g3 sizeLimitExceeded() {
        return new C1912g3("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public static C1912g3 truncatedMessage() {
        return new C1912g3("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public boolean getThrownFromInputStream() {
        return this.wasThrownFromInputStream;
    }

    public N3 getUnfinishedMessage() {
        return this.unfinishedMessage;
    }

    public void setThrownFromInputStream() {
        this.wasThrownFromInputStream = true;
    }

    public C1912g3 setUnfinishedMessage(N3 n32) {
        this.unfinishedMessage = n32;
        return this;
    }

    public IOException unwrapIOException() {
        if (getCause() instanceof IOException) {
            return (IOException) getCause();
        }
        return this;
    }

    public C1912g3(Exception exc) {
        super(exc.getMessage(), exc);
        this.unfinishedMessage = null;
    }

    public C1912g3(String str, Exception exc) {
        super(str, exc);
        this.unfinishedMessage = null;
    }

    public C1912g3(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.unfinishedMessage = null;
    }

    public C1912g3(String str, IOException iOException) {
        super(str, iOException);
        this.unfinishedMessage = null;
    }
}
