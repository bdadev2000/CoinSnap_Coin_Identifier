package com.vungle.ads.internal.load;

/* loaded from: classes3.dex */
public final class d {
    private final String description;
    private final String descriptionExternal;
    private final boolean errorIsTerminal;
    private final int reason;

    public d(int i9, String str, String str2, boolean z8) {
        G7.j.e(str, "description");
        G7.j.e(str2, "descriptionExternal");
        this.reason = i9;
        this.description = str;
        this.descriptionExternal = str2;
        this.errorIsTerminal = z8;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDescriptionExternal() {
        return this.descriptionExternal;
    }

    public final boolean getErrorIsTerminal() {
        return this.errorIsTerminal;
    }

    public final int getReason() {
        return this.reason;
    }

    public /* synthetic */ d(int i9, String str, String str2, boolean z8, int i10, G7.f fVar) {
        this(i9, str, (i10 & 4) != 0 ? str : str2, (i10 & 8) != 0 ? false : z8);
    }
}
