package l5;

import x0.AbstractC2914a;

/* loaded from: classes2.dex */
public final class o implements k5.h {

    /* renamed from: a, reason: collision with root package name */
    public final String f21638a;
    public final int b;

    public o(String str, int i9) {
        this.f21638a = str;
        this.b = i9;
    }

    public final boolean a() {
        if (this.b == 0) {
            return false;
        }
        String trim = d().trim();
        if (h.f21608e.matcher(trim).matches()) {
            return true;
        }
        if (h.f21609f.matcher(trim).matches()) {
            return false;
        }
        throw new IllegalArgumentException(AbstractC2914a.e("[Value: ", trim, "] cannot be converted to a boolean."));
    }

    public final double b() {
        if (this.b == 0) {
            return 0.0d;
        }
        String trim = d().trim();
        try {
            return Double.valueOf(trim).doubleValue();
        } catch (NumberFormatException e4) {
            throw new IllegalArgumentException(AbstractC2914a.e("[Value: ", trim, "] cannot be converted to a double."), e4);
        }
    }

    public final long c() {
        if (this.b == 0) {
            return 0L;
        }
        String trim = d().trim();
        try {
            return Long.valueOf(trim).longValue();
        } catch (NumberFormatException e4) {
            throw new IllegalArgumentException(AbstractC2914a.e("[Value: ", trim, "] cannot be converted to a long."), e4);
        }
    }

    public final String d() {
        if (this.b == 0) {
            return "";
        }
        String str = this.f21638a;
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("Value is null, and cannot be converted to the desired type.");
    }
}
