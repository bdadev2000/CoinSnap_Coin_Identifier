package com.google.protobuf;

import java.io.IOException;

/* renamed from: com.google.protobuf.n3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1961n3 {
    private static final W1 EMPTY_REGISTRY = W1.getEmptyRegistry();
    private H delayedBytes;
    private W1 extensionRegistry;
    private volatile H memoizedBytes;
    protected volatile N3 value;

    public C1961n3(W1 w1, H h6) {
        checkArguments(w1, h6);
        this.extensionRegistry = w1;
        this.delayedBytes = h6;
    }

    private static void checkArguments(W1 w1, H h6) {
        if (w1 != null) {
            if (h6 != null) {
                return;
            } else {
                throw new NullPointerException("found null ByteString");
            }
        }
        throw new NullPointerException("found null ExtensionRegistry");
    }

    public static C1961n3 fromValue(N3 n32) {
        C1961n3 c1961n3 = new C1961n3();
        c1961n3.setValue(n32);
        return c1961n3;
    }

    private static N3 mergeValueAndBytes(N3 n32, H h6, W1 w1) {
        try {
            return ((D2) ((AbstractC1873b) n32.toBuilder()).mergeFrom(h6, w1)).build();
        } catch (C1912g3 unused) {
            return n32;
        }
    }

    public void clear() {
        this.delayedBytes = null;
        this.value = null;
        this.memoizedBytes = null;
    }

    public boolean containsDefaultInstance() {
        H h6;
        H h9 = this.memoizedBytes;
        H h10 = H.EMPTY;
        if (h9 != h10 && (this.value != null || ((h6 = this.delayedBytes) != null && h6 != h10))) {
            return false;
        }
        return true;
    }

    public void ensureInitialized(N3 n32) {
        if (this.value != null) {
            return;
        }
        synchronized (this) {
            if (this.value != null) {
                return;
            }
            try {
                if (this.delayedBytes != null) {
                    this.value = (N3) ((AbstractC1887d) n32.getParserForType()).parseFrom(this.delayedBytes, this.extensionRegistry);
                    this.memoizedBytes = this.delayedBytes;
                } else {
                    this.value = n32;
                    this.memoizedBytes = H.EMPTY;
                }
            } catch (C1912g3 unused) {
                this.value = n32;
                this.memoizedBytes = H.EMPTY;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1961n3)) {
            return false;
        }
        C1961n3 c1961n3 = (C1961n3) obj;
        N3 n32 = this.value;
        N3 n33 = c1961n3.value;
        if (n32 == null && n33 == null) {
            return toByteString().equals(c1961n3.toByteString());
        }
        if (n32 != null && n33 != null) {
            return n32.equals(n33);
        }
        if (n32 != null) {
            return n32.equals(c1961n3.getValue(n32.getDefaultInstanceForType()));
        }
        return getValue(n33.getDefaultInstanceForType()).equals(n33);
    }

    public int getSerializedSize() {
        if (this.memoizedBytes != null) {
            return this.memoizedBytes.size();
        }
        H h6 = this.delayedBytes;
        if (h6 != null) {
            return h6.size();
        }
        if (this.value != null) {
            return this.value.getSerializedSize();
        }
        return 0;
    }

    public N3 getValue(N3 n32) {
        ensureInitialized(n32);
        return this.value;
    }

    public int hashCode() {
        return 1;
    }

    public void merge(C1961n3 c1961n3) {
        H h6;
        if (c1961n3.containsDefaultInstance()) {
            return;
        }
        if (containsDefaultInstance()) {
            set(c1961n3);
            return;
        }
        if (this.extensionRegistry == null) {
            this.extensionRegistry = c1961n3.extensionRegistry;
        }
        H h9 = this.delayedBytes;
        if (h9 != null && (h6 = c1961n3.delayedBytes) != null) {
            this.delayedBytes = h9.concat(h6);
            return;
        }
        if (this.value == null && c1961n3.value != null) {
            setValue(mergeValueAndBytes(c1961n3.value, this.delayedBytes, this.extensionRegistry));
        } else if (this.value != null && c1961n3.value == null) {
            setValue(mergeValueAndBytes(this.value, c1961n3.delayedBytes, c1961n3.extensionRegistry));
        } else {
            setValue(((D2) ((AbstractC1873b) this.value.toBuilder()).mergeFrom(c1961n3.value)).build());
        }
    }

    public void mergeFrom(S s5, W1 w1) throws IOException {
        if (containsDefaultInstance()) {
            setByteString(s5.readBytes(), w1);
            return;
        }
        if (this.extensionRegistry == null) {
            this.extensionRegistry = w1;
        }
        H h6 = this.delayedBytes;
        if (h6 != null) {
            setByteString(h6.concat(s5.readBytes()), this.extensionRegistry);
        } else {
            try {
                setValue(((D2) this.value.toBuilder().mergeFrom(s5, w1)).build());
            } catch (C1912g3 unused) {
            }
        }
    }

    public void set(C1961n3 c1961n3) {
        this.delayedBytes = c1961n3.delayedBytes;
        this.value = c1961n3.value;
        this.memoizedBytes = c1961n3.memoizedBytes;
        W1 w1 = c1961n3.extensionRegistry;
        if (w1 != null) {
            this.extensionRegistry = w1;
        }
    }

    public void setByteString(H h6, W1 w1) {
        checkArguments(w1, h6);
        this.delayedBytes = h6;
        this.extensionRegistry = w1;
        this.value = null;
        this.memoizedBytes = null;
    }

    public N3 setValue(N3 n32) {
        N3 n33 = this.value;
        this.delayedBytes = null;
        this.memoizedBytes = null;
        this.value = n32;
        return n33;
    }

    public H toByteString() {
        if (this.memoizedBytes != null) {
            return this.memoizedBytes;
        }
        H h6 = this.delayedBytes;
        if (h6 != null) {
            return h6;
        }
        synchronized (this) {
            try {
                if (this.memoizedBytes != null) {
                    return this.memoizedBytes;
                }
                if (this.value == null) {
                    this.memoizedBytes = H.EMPTY;
                } else {
                    this.memoizedBytes = this.value.toByteString();
                }
                return this.memoizedBytes;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void writeTo(a6 a6Var, int i9) throws IOException {
        if (this.memoizedBytes != null) {
            ((C1909g0) a6Var).writeBytes(i9, this.memoizedBytes);
            return;
        }
        H h6 = this.delayedBytes;
        if (h6 != null) {
            ((C1909g0) a6Var).writeBytes(i9, h6);
        } else if (this.value != null) {
            ((C1909g0) a6Var).writeMessage(i9, this.value);
        } else {
            ((C1909g0) a6Var).writeBytes(i9, H.EMPTY);
        }
    }

    public C1961n3() {
    }
}
