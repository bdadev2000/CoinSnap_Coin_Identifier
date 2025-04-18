package com.google.gson;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class u extends p {

    /* renamed from: b, reason: collision with root package name */
    public final Serializable f12126b;

    public u(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f12126b = bool;
    }

    public static boolean d(u uVar) {
        Serializable serializable = uVar.f12126b;
        if (serializable instanceof Number) {
            Number number = (Number) serializable;
            if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
                return true;
            }
        }
        return false;
    }

    public final BigInteger a() {
        Serializable serializable = this.f12126b;
        if (serializable instanceof BigInteger) {
            return (BigInteger) serializable;
        }
        if (d(this)) {
            return BigInteger.valueOf(b().longValue());
        }
        String c10 = c();
        com.facebook.appevents.g.c(c10);
        return new BigInteger(c10);
    }

    public final Number b() {
        Serializable serializable = this.f12126b;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new uc.h((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public final String c() {
        Serializable serializable = this.f12126b;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return b().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }

    public final boolean equals(Object obj) {
        double parseDouble;
        double parseDouble2;
        BigDecimal E;
        BigDecimal E2;
        if (this == obj) {
            return true;
        }
        if (obj == null || u.class != obj.getClass()) {
            return false;
        }
        u uVar = (u) obj;
        Serializable serializable = this.f12126b;
        Serializable serializable2 = uVar.f12126b;
        if (serializable == null) {
            if (serializable2 == null) {
                return true;
            }
            return false;
        }
        boolean d10 = d(this);
        Serializable serializable3 = uVar.f12126b;
        if (d10 && d(uVar)) {
            if (!(serializable instanceof BigInteger) && !(serializable3 instanceof BigInteger)) {
                if (b().longValue() == uVar.b().longValue()) {
                    return true;
                }
                return false;
            }
            return a().equals(uVar.a());
        }
        if ((serializable instanceof Number) && (serializable2 instanceof Number)) {
            if ((serializable instanceof BigDecimal) && (serializable2 instanceof BigDecimal)) {
                if (serializable instanceof BigDecimal) {
                    E = (BigDecimal) serializable;
                } else {
                    E = com.facebook.appevents.g.E(c());
                }
                if (serializable3 instanceof BigDecimal) {
                    E2 = (BigDecimal) serializable3;
                } else {
                    E2 = com.facebook.appevents.g.E(uVar.c());
                }
                if (E.compareTo(E2) == 0) {
                    return true;
                }
                return false;
            }
            if (serializable instanceof Number) {
                parseDouble = b().doubleValue();
            } else {
                parseDouble = Double.parseDouble(c());
            }
            if (serializable3 instanceof Number) {
                parseDouble2 = uVar.b().doubleValue();
            } else {
                parseDouble2 = Double.parseDouble(uVar.c());
            }
            if (parseDouble == parseDouble2) {
                return true;
            }
            if (Double.isNaN(parseDouble) && Double.isNaN(parseDouble2)) {
                return true;
            }
            return false;
        }
        return serializable.equals(serializable2);
    }

    public final int hashCode() {
        long doubleToLongBits;
        Serializable serializable = this.f12126b;
        if (serializable == null) {
            return 31;
        }
        if (d(this)) {
            doubleToLongBits = b().longValue();
        } else if (serializable instanceof Number) {
            doubleToLongBits = Double.doubleToLongBits(b().doubleValue());
        } else {
            return serializable.hashCode();
        }
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public u(Number number) {
        Objects.requireNonNull(number);
        this.f12126b = number;
    }

    public u(String str) {
        Objects.requireNonNull(str);
        this.f12126b = str;
    }
}
