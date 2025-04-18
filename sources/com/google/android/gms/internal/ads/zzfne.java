package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public enum zzfne {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    UNSPECIFIED("unspecified"),
    LOADED("loaded"),
    BEGIN_TO_RENDER("beginToRender"),
    ONE_PIXEL("onePixel"),
    VIEWABLE("viewable"),
    AUDIBLE("audible"),
    OTHER("other");

    private final String zzj;

    zzfne(String str) {
        this.zzj = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zzj;
    }
}
