package com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3;

import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import com.meta.analytics.dsp.uinode.AbstractC1192Ha;

/* loaded from: assets/audience_network.dex */
public abstract class Id3Frame implements Metadata.Entry {
    public final String A00;

    public Id3Frame(String str) {
        this.A00 = (String) AbstractC1192Ha.A01(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.A00;
    }
}
