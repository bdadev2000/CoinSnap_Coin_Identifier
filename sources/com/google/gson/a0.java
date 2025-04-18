package com.google.gson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public abstract class a0 implements b0 {

    /* renamed from: b, reason: collision with root package name */
    public static final w f12097b;

    /* renamed from: c, reason: collision with root package name */
    public static final x f12098c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a0[] f12099d;

    static {
        w wVar = new w();
        f12097b = wVar;
        x xVar = new x();
        f12098c = xVar;
        f12099d = new a0[]{wVar, xVar, new a0() { // from class: com.google.gson.y
            public static Double b(zc.a aVar, String str) {
                boolean z10;
                try {
                    Double valueOf = Double.valueOf(str);
                    if (valueOf.isInfinite() || valueOf.isNaN()) {
                        if (aVar.f28729q == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (!z10) {
                            throw new zc.c("JSON forbids NaN and infinities: " + valueOf + "; at path " + aVar.s(true));
                        }
                    }
                    return valueOf;
                } catch (NumberFormatException e2) {
                    StringBuilder o10 = a4.j.o("Cannot parse ", str, "; at path ");
                    o10.append(aVar.s(true));
                    throw new t(o10.toString(), e2);
                }
            }

            @Override // com.google.gson.b0
            public final Number a(zc.a aVar) {
                String Z = aVar.Z();
                if (Z.indexOf(46) >= 0) {
                    return b(aVar, Z);
                }
                try {
                    return Long.valueOf(Long.parseLong(Z));
                } catch (NumberFormatException unused) {
                    return b(aVar, Z);
                }
            }
        }, new a0() { // from class: com.google.gson.z
            @Override // com.google.gson.b0
            public final Number a(zc.a aVar) {
                String Z = aVar.Z();
                try {
                    return com.facebook.appevents.g.E(Z);
                } catch (NumberFormatException e2) {
                    StringBuilder o10 = a4.j.o("Cannot parse ", Z, "; at path ");
                    o10.append(aVar.s(true));
                    throw new t(o10.toString(), e2);
                }
            }
        }};
    }

    public a0(String str, int i10) {
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) f12099d.clone();
    }
}
