package com.meta.analytics.dsp.uinode;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35.PrivateCommand;

/* renamed from: com.facebook.ads.redexgen.X.Do, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1110Do implements Parcelable.Creator<PrivateCommand> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final PrivateCommand createFromParcel(Parcel parcel) {
        return new PrivateCommand(parcel, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final PrivateCommand[] newArray(int i9) {
        return new PrivateCommand[i9];
    }
}
