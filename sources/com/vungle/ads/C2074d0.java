package com.vungle.ads;

/* renamed from: com.vungle.ads.d0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2074d0 extends o1 {
    public /* synthetic */ C2074d0(int i9, String str, int i10, G7.f fVar) {
        this(i9, (i10 & 2) != 0 ? null : str);
    }

    @Override // com.vungle.ads.o1
    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!C2074d0.class.equals(cls)) {
            return false;
        }
        int code = getCode();
        G7.j.c(obj, "null cannot be cast to non-null type com.vungle.ads.InternalError");
        if (code == ((C2074d0) obj).getCode()) {
            return true;
        }
        return false;
    }

    @Override // com.vungle.ads.o1
    public int hashCode() {
        return C2074d0.class.hashCode();
    }

    public C2074d0(int i9, String str) {
        super(Integer.valueOf(i9), null, str, null, null, null, 58, null);
    }
}
