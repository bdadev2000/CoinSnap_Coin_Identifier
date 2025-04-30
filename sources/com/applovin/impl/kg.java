package com.applovin.impl;

import android.view.View;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;

/* loaded from: classes.dex */
public class kg {

    /* renamed from: a, reason: collision with root package name */
    private final View f8689a;
    private final FriendlyObstructionPurpose b;

    /* renamed from: c, reason: collision with root package name */
    private final String f8690c;

    public kg(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f8689a = view;
        this.b = friendlyObstructionPurpose;
        this.f8690c = str;
    }

    public String a() {
        return this.f8690c;
    }

    public FriendlyObstructionPurpose b() {
        return this.b;
    }

    public View c() {
        return this.f8689a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        kg kgVar = (kg) obj;
        View view = this.f8689a;
        if (view == null ? kgVar.f8689a != null : !view.equals(kgVar.f8689a)) {
            return false;
        }
        if (this.b != kgVar.b) {
            return false;
        }
        String str = this.f8690c;
        String str2 = kgVar.f8690c;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i9;
        int i10;
        View view = this.f8689a;
        int i11 = 0;
        if (view != null) {
            i9 = view.hashCode();
        } else {
            i9 = 0;
        }
        int i12 = i9 * 31;
        FriendlyObstructionPurpose friendlyObstructionPurpose = this.b;
        if (friendlyObstructionPurpose != null) {
            i10 = friendlyObstructionPurpose.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (i12 + i10) * 31;
        String str = this.f8690c;
        if (str != null) {
            i11 = str.hashCode();
        }
        return i13 + i11;
    }
}
