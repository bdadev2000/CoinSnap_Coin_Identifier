package com.applovin.impl;

import android.view.View;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;

/* loaded from: classes.dex */
public class og {

    /* renamed from: a, reason: collision with root package name */
    private final View f25863a;

    /* renamed from: b, reason: collision with root package name */
    private final FriendlyObstructionPurpose f25864b;

    /* renamed from: c, reason: collision with root package name */
    private final String f25865c;

    public og(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f25863a = view;
        this.f25864b = friendlyObstructionPurpose;
        this.f25865c = str;
    }

    public String a() {
        return this.f25865c;
    }

    public FriendlyObstructionPurpose b() {
        return this.f25864b;
    }

    public View c() {
        return this.f25863a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        og ogVar = (og) obj;
        View view = this.f25863a;
        if (view == null ? ogVar.f25863a != null : !view.equals(ogVar.f25863a)) {
            return false;
        }
        if (this.f25864b != ogVar.f25864b) {
            return false;
        }
        String str = this.f25865c;
        String str2 = ogVar.f25865c;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        View view = this.f25863a;
        int hashCode = (view != null ? view.hashCode() : 0) * 31;
        FriendlyObstructionPurpose friendlyObstructionPurpose = this.f25864b;
        int hashCode2 = (hashCode + (friendlyObstructionPurpose != null ? friendlyObstructionPurpose.hashCode() : 0)) * 31;
        String str = this.f25865c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }
}
