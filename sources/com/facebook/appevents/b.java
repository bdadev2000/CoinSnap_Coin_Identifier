package com.facebook.appevents;

import com.facebook.internal.H;
import java.io.ObjectStreamException;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class b implements Serializable {
    private static final long serialVersionUID = 1;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final String f13471c;

    public b(String str, String str2) {
        this.b = str2;
        this.f13471c = H.B(str) ? null : str;
    }

    private final Object writeReplace() throws ObjectStreamException {
        return new a(this.f13471c, this.b);
    }

    public final boolean equals(Object obj) {
        boolean equals;
        boolean equals2;
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        String str = bVar.f13471c;
        String str2 = this.f13471c;
        if (str == null) {
            if (str2 == null) {
                equals = true;
            } else {
                equals = false;
            }
        } else {
            equals = str.equals(str2);
        }
        if (!equals) {
            return false;
        }
        String str3 = bVar.b;
        String str4 = this.b;
        if (str3 == null) {
            if (str4 == null) {
                equals2 = true;
            } else {
                equals2 = false;
            }
        } else {
            equals2 = str3.equals(str4);
        }
        if (!equals2) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.f13471c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode ^ this.b.hashCode();
    }
}
