package com.applovin.impl;

import android.view.View;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;

/* loaded from: classes.dex */
public class kg {
    private final View a;

    /* renamed from: b, reason: collision with root package name */
    private final FriendlyObstructionPurpose f5707b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5708c;

    public kg(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.a = view;
        this.f5707b = friendlyObstructionPurpose;
        this.f5708c = str;
    }

    public String a() {
        return this.f5708c;
    }

    public FriendlyObstructionPurpose b() {
        return this.f5707b;
    }

    public View c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        kg kgVar = (kg) obj;
        View view = this.a;
        if (view == null ? kgVar.a != null : !view.equals(kgVar.a)) {
            return false;
        }
        if (this.f5707b != kgVar.f5707b) {
            return false;
        }
        String str = this.f5708c;
        String str2 = kgVar.f5708c;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11;
        View view = this.a;
        int i12 = 0;
        if (view != null) {
            i10 = view.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = i10 * 31;
        FriendlyObstructionPurpose friendlyObstructionPurpose = this.f5707b;
        if (friendlyObstructionPurpose != null) {
            i11 = friendlyObstructionPurpose.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i13 + i11) * 31;
        String str = this.f5708c;
        if (str != null) {
            i12 = str.hashCode();
        }
        return i14 + i12;
    }
}
