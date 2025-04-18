package com.vungle.ads.internal.load;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d {
    private final String description;
    private final String descriptionExternal;
    private final boolean errorIsTerminal;
    private final int reason;

    public d(int i10, String description, String descriptionExternal, boolean z10) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(descriptionExternal, "descriptionExternal");
        this.reason = i10;
        this.description = description;
        this.descriptionExternal = descriptionExternal;
        this.errorIsTerminal = z10;
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

    public /* synthetic */ d(int i10, String str, String str2, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, str, (i11 & 4) != 0 ? str : str2, (i11 & 8) != 0 ? false : z10);
    }
}
