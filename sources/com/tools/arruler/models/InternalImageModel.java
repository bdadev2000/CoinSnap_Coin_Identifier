package com.tools.arruler.models;

import G7.j;
import Q7.n0;
import com.mbridge.msdk.MBridgeConstans;
import x0.AbstractC2914a;

/* loaded from: classes3.dex */
public final class InternalImageModel {

    /* renamed from: a, reason: collision with root package name */
    public final String f19634a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final long f19635c;

    public InternalImageModel(String str, String str2, long j7) {
        j.e(str, MBridgeConstans.DYNAMIC_VIEW_WX_PATH);
        j.e(str2, "name");
        this.f19634a = str;
        this.b = str2;
        this.f19635c = j7;
    }

    public static /* synthetic */ InternalImageModel copy$default(InternalImageModel internalImageModel, String str, String str2, long j7, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = internalImageModel.f19634a;
        }
        if ((i9 & 2) != 0) {
            str2 = internalImageModel.b;
        }
        if ((i9 & 4) != 0) {
            j7 = internalImageModel.f19635c;
        }
        return internalImageModel.copy(str, str2, j7);
    }

    public final String component1() {
        return this.f19634a;
    }

    public final String component2() {
        return this.b;
    }

    public final long component3() {
        return this.f19635c;
    }

    public final InternalImageModel copy(String str, String str2, long j7) {
        j.e(str, MBridgeConstans.DYNAMIC_VIEW_WX_PATH);
        j.e(str2, "name");
        return new InternalImageModel(str, str2, j7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InternalImageModel)) {
            return false;
        }
        InternalImageModel internalImageModel = (InternalImageModel) obj;
        return j.a(this.f19634a, internalImageModel.f19634a) && j.a(this.b, internalImageModel.b) && this.f19635c == internalImageModel.f19635c;
    }

    public final long getLastModified() {
        return this.f19635c;
    }

    public final String getName() {
        return this.b;
    }

    public final String getPath() {
        return this.f19634a;
    }

    public int hashCode() {
        return Long.hashCode(this.f19635c) + AbstractC2914a.b(this.f19634a.hashCode() * 31, 31, this.b);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("InternalImageModel(path=");
        sb.append(this.f19634a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", lastModified=");
        return n0.k(sb, this.f19635c, ")");
    }
}
