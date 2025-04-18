package com.google.protobuf;

import java.io.IOException;

/* loaded from: classes4.dex */
public class o4 {
    private static final a2 EMPTY_REGISTRY = a2.getEmptyRegistry();
    private h0 delayedBytes;
    private a2 extensionRegistry;
    private volatile h0 memoizedBytes;
    protected volatile o5 value;

    public o4() {
    }

    public o4(a2 a2Var, h0 h0Var) {
        checkArguments(a2Var, h0Var);
        this.extensionRegistry = a2Var;
        this.delayedBytes = h0Var;
    }

    private static void checkArguments(a2 a2Var, h0 h0Var) {
        if (a2Var != null) {
            if (h0Var != null) {
                return;
            } else {
                throw new NullPointerException("found null ByteString");
            }
        }
        throw new NullPointerException("found null ExtensionRegistry");
    }

    public static o4 fromValue(o5 o5Var) {
        o4 o4Var = new o4();
        o4Var.setValue(o5Var);
        return o4Var;
    }

    private static o5 mergeValueAndBytes(o5 o5Var, h0 h0Var, a2 a2Var) {
        try {
            return ((h3) ((b) o5Var.toBuilder()).mergeFrom(h0Var, a2Var)).build();
        } catch (h4 unused) {
            return o5Var;
        }
    }

    public void clear() {
        this.delayedBytes = null;
        this.value = null;
        this.memoizedBytes = null;
    }

    public boolean containsDefaultInstance() {
        h0 h0Var;
        h0 h0Var2 = this.memoizedBytes;
        h0 h0Var3 = h0.EMPTY;
        return h0Var2 == h0Var3 || (this.value == null && ((h0Var = this.delayedBytes) == null || h0Var == h0Var3));
    }

    public void ensureInitialized(o5 o5Var) {
        if (this.value != null) {
            return;
        }
        synchronized (this) {
            if (this.value != null) {
                return;
            }
            try {
                if (this.delayedBytes != null) {
                    this.value = (o5) ((d) o5Var.getParserForType()).parseFrom(this.delayedBytes, this.extensionRegistry);
                    this.memoizedBytes = this.delayedBytes;
                } else {
                    this.value = o5Var;
                    this.memoizedBytes = h0.EMPTY;
                }
            } catch (h4 unused) {
                this.value = o5Var;
                this.memoizedBytes = h0.EMPTY;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o4)) {
            return false;
        }
        o4 o4Var = (o4) obj;
        o5 o5Var = this.value;
        o5 o5Var2 = o4Var.value;
        if (o5Var == null && o5Var2 == null) {
            return toByteString().equals(o4Var.toByteString());
        }
        if (o5Var != null && o5Var2 != null) {
            return o5Var.equals(o5Var2);
        }
        if (o5Var != null) {
            return o5Var.equals(o4Var.getValue(o5Var.getDefaultInstanceForType()));
        }
        return getValue(o5Var2.getDefaultInstanceForType()).equals(o5Var2);
    }

    public int getSerializedSize() {
        if (this.memoizedBytes != null) {
            return this.memoizedBytes.size();
        }
        h0 h0Var = this.delayedBytes;
        if (h0Var != null) {
            return h0Var.size();
        }
        if (this.value != null) {
            return this.value.getSerializedSize();
        }
        return 0;
    }

    public o5 getValue(o5 o5Var) {
        ensureInitialized(o5Var);
        return this.value;
    }

    public int hashCode() {
        return 1;
    }

    public void merge(o4 o4Var) {
        h0 h0Var;
        if (o4Var.containsDefaultInstance()) {
            return;
        }
        if (containsDefaultInstance()) {
            set(o4Var);
            return;
        }
        if (this.extensionRegistry == null) {
            this.extensionRegistry = o4Var.extensionRegistry;
        }
        h0 h0Var2 = this.delayedBytes;
        if (h0Var2 != null && (h0Var = o4Var.delayedBytes) != null) {
            this.delayedBytes = h0Var2.concat(h0Var);
            return;
        }
        if (this.value == null && o4Var.value != null) {
            setValue(mergeValueAndBytes(o4Var.value, this.delayedBytes, this.extensionRegistry));
        } else if (this.value != null && o4Var.value == null) {
            setValue(mergeValueAndBytes(this.value, o4Var.delayedBytes, o4Var.extensionRegistry));
        } else {
            setValue(((h3) ((b) this.value.toBuilder()).mergeFrom(o4Var.value)).build());
        }
    }

    public void mergeFrom(r0 r0Var, a2 a2Var) throws IOException {
        if (containsDefaultInstance()) {
            setByteString(r0Var.readBytes(), a2Var);
            return;
        }
        if (this.extensionRegistry == null) {
            this.extensionRegistry = a2Var;
        }
        h0 h0Var = this.delayedBytes;
        if (h0Var != null) {
            setByteString(h0Var.concat(r0Var.readBytes()), this.extensionRegistry);
        } else {
            try {
                setValue(((h3) this.value.toBuilder().mergeFrom(r0Var, a2Var)).build());
            } catch (h4 unused) {
            }
        }
    }

    public void set(o4 o4Var) {
        this.delayedBytes = o4Var.delayedBytes;
        this.value = o4Var.value;
        this.memoizedBytes = o4Var.memoizedBytes;
        a2 a2Var = o4Var.extensionRegistry;
        if (a2Var != null) {
            this.extensionRegistry = a2Var;
        }
    }

    public void setByteString(h0 h0Var, a2 a2Var) {
        checkArguments(a2Var, h0Var);
        this.delayedBytes = h0Var;
        this.extensionRegistry = a2Var;
        this.value = null;
        this.memoizedBytes = null;
    }

    public o5 setValue(o5 o5Var) {
        o5 o5Var2 = this.value;
        this.delayedBytes = null;
        this.memoizedBytes = null;
        this.value = o5Var;
        return o5Var2;
    }

    public h0 toByteString() {
        if (this.memoizedBytes != null) {
            return this.memoizedBytes;
        }
        h0 h0Var = this.delayedBytes;
        if (h0Var != null) {
            return h0Var;
        }
        synchronized (this) {
            if (this.memoizedBytes != null) {
                return this.memoizedBytes;
            }
            if (this.value == null) {
                this.memoizedBytes = h0.EMPTY;
            } else {
                this.memoizedBytes = this.value.toByteString();
            }
            return this.memoizedBytes;
        }
    }

    public void writeTo(ba baVar, int i10) throws IOException {
        if (this.memoizedBytes != null) {
            ((f1) baVar).writeBytes(i10, this.memoizedBytes);
            return;
        }
        h0 h0Var = this.delayedBytes;
        if (h0Var != null) {
            ((f1) baVar).writeBytes(i10, h0Var);
        } else if (this.value != null) {
            ((f1) baVar).writeMessage(i10, this.value);
        } else {
            ((f1) baVar).writeBytes(i10, h0.EMPTY);
        }
    }
}
