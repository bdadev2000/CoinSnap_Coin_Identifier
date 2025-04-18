package org.objectweb.asm;

import android.support.v4.media.d;

/* loaded from: classes3.dex */
public final class Handle {
    private final String descriptor;
    private final boolean isInterface;
    private final String name;
    private final String owner;
    private final int tag;

    @Deprecated
    public Handle(int i2, String str, String str2, String str3) {
        this(i2, str, str2, str3, i2 == 9);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Handle)) {
            return false;
        }
        Handle handle = (Handle) obj;
        return this.tag == handle.tag && this.isInterface == handle.isInterface && this.owner.equals(handle.owner) && this.name.equals(handle.name) && this.descriptor.equals(handle.descriptor);
    }

    public String getDesc() {
        return this.descriptor;
    }

    public String getName() {
        return this.name;
    }

    public String getOwner() {
        return this.owner;
    }

    public int getTag() {
        return this.tag;
    }

    public int hashCode() {
        return (this.descriptor.hashCode() * this.name.hashCode() * this.owner.hashCode()) + this.tag + (this.isInterface ? 64 : 0);
    }

    public boolean isInterface() {
        return this.isInterface;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.owner);
        sb.append('.');
        sb.append(this.name);
        sb.append(this.descriptor);
        sb.append(" (");
        sb.append(this.tag);
        return d.q(sb, this.isInterface ? " itf" : "", ')');
    }

    public Handle(int i2, String str, String str2, String str3, boolean z2) {
        this.tag = i2;
        this.owner = str;
        this.name = str2;
        this.descriptor = str3;
        this.isInterface = z2;
    }
}
