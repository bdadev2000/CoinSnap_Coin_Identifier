package com.applovin.impl.mediation;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxMediatedNetworkInfo;
import com.applovin.mediation.MaxNetworkResponseInfo;

/* loaded from: classes.dex */
public class MaxNetworkResponseInfoImpl implements MaxNetworkResponseInfo {
    private final MaxNetworkResponseInfo.AdLoadState a;

    /* renamed from: b, reason: collision with root package name */
    private final MaxMediatedNetworkInfo f5984b;

    /* renamed from: c, reason: collision with root package name */
    private final Bundle f5985c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f5986d;

    /* renamed from: e, reason: collision with root package name */
    private final long f5987e;

    /* renamed from: f, reason: collision with root package name */
    private final String f5988f;

    /* renamed from: g, reason: collision with root package name */
    private final MaxError f5989g;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[MaxNetworkResponseInfo.AdLoadState.values().length];
            a = iArr;
            try {
                iArr[MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[MaxNetworkResponseInfo.AdLoadState.AD_LOADED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public MaxNetworkResponseInfoImpl(MaxNetworkResponseInfo.AdLoadState adLoadState, MaxMediatedNetworkInfo maxMediatedNetworkInfo, Bundle bundle, boolean z10, long j3, String str, @Nullable MaxError maxError) {
        this.a = adLoadState;
        this.f5984b = maxMediatedNetworkInfo;
        this.f5985c = bundle;
        this.f5986d = z10;
        this.f5987e = j3;
        this.f5988f = str;
        this.f5989g = maxError;
    }

    public boolean canEqual(Object obj) {
        return obj instanceof MaxNetworkResponseInfoImpl;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MaxNetworkResponseInfoImpl)) {
            return false;
        }
        MaxNetworkResponseInfoImpl maxNetworkResponseInfoImpl = (MaxNetworkResponseInfoImpl) obj;
        if (!maxNetworkResponseInfoImpl.canEqual(this) || isBidding() != maxNetworkResponseInfoImpl.isBidding() || getLatencyMillis() != maxNetworkResponseInfoImpl.getLatencyMillis()) {
            return false;
        }
        MaxNetworkResponseInfo.AdLoadState adLoadState = getAdLoadState();
        MaxNetworkResponseInfo.AdLoadState adLoadState2 = maxNetworkResponseInfoImpl.getAdLoadState();
        if (adLoadState != null ? !adLoadState.equals(adLoadState2) : adLoadState2 != null) {
            return false;
        }
        MaxMediatedNetworkInfo mediatedNetwork = getMediatedNetwork();
        MaxMediatedNetworkInfo mediatedNetwork2 = maxNetworkResponseInfoImpl.getMediatedNetwork();
        if (mediatedNetwork != null ? !mediatedNetwork.equals(mediatedNetwork2) : mediatedNetwork2 != null) {
            return false;
        }
        Bundle credentials = getCredentials();
        Bundle credentials2 = maxNetworkResponseInfoImpl.getCredentials();
        if (credentials != null ? !credentials.equals(credentials2) : credentials2 != null) {
            return false;
        }
        String bCode = getBCode();
        String bCode2 = maxNetworkResponseInfoImpl.getBCode();
        if (bCode != null ? !bCode.equals(bCode2) : bCode2 != null) {
            return false;
        }
        MaxError error = getError();
        MaxError error2 = maxNetworkResponseInfoImpl.getError();
        return error != null ? error.equals(error2) : error2 == null;
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    public MaxNetworkResponseInfo.AdLoadState getAdLoadState() {
        return this.a;
    }

    public String getBCode() {
        return this.f5988f;
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    public Bundle getCredentials() {
        return this.f5985c;
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    @Nullable
    public MaxError getError() {
        return this.f5989g;
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    public long getLatencyMillis() {
        return this.f5987e;
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    public MaxMediatedNetworkInfo getMediatedNetwork() {
        return this.f5984b;
    }

    public int hashCode() {
        int i10 = isBidding() ? 79 : 97;
        long latencyMillis = getLatencyMillis();
        int i11 = ((i10 + 59) * 59) + ((int) (latencyMillis ^ (latencyMillis >>> 32)));
        MaxNetworkResponseInfo.AdLoadState adLoadState = getAdLoadState();
        int hashCode = (i11 * 59) + (adLoadState == null ? 43 : adLoadState.hashCode());
        MaxMediatedNetworkInfo mediatedNetwork = getMediatedNetwork();
        int hashCode2 = (hashCode * 59) + (mediatedNetwork == null ? 43 : mediatedNetwork.hashCode());
        Bundle credentials = getCredentials();
        int hashCode3 = (hashCode2 * 59) + (credentials == null ? 43 : credentials.hashCode());
        String bCode = getBCode();
        int hashCode4 = (hashCode3 * 59) + (bCode == null ? 43 : bCode.hashCode());
        MaxError error = getError();
        return (hashCode4 * 59) + (error != null ? error.hashCode() : 43);
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    public boolean isBidding() {
        return this.f5986d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0041, code lost:
    
        if (r1 != 2) goto L9;
     */
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "MaxResponseInfo{adLoadState="
            r1.<init>(r2)
            com.applovin.mediation.MaxNetworkResponseInfo$AdLoadState r2 = r3.a
            r1.append(r2)
            java.lang.String r2 = ", mediatedNetwork="
            r1.append(r2)
            com.applovin.mediation.MaxMediatedNetworkInfo r2 = r3.f5984b
            r1.append(r2)
            java.lang.String r2 = ", credentials="
            r1.append(r2)
            android.os.Bundle r2 = r3.f5985c
            r1.append(r2)
            java.lang.String r2 = ", isBidding="
            r1.append(r2)
            boolean r2 = r3.f5986d
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            int[] r1 = com.applovin.impl.mediation.MaxNetworkResponseInfoImpl.a.a
            com.applovin.mediation.MaxNetworkResponseInfo$AdLoadState r2 = r3.a
            int r2 = r2.ordinal()
            r1 = r1[r2]
            r2 = 1
            if (r1 == r2) goto L44
            r2 = 2
            if (r1 == r2) goto L4e
            goto L58
        L44:
            java.lang.String r1 = ", error="
            r0.append(r1)
            com.applovin.mediation.MaxError r1 = r3.f5989g
            r0.append(r1)
        L4e:
            java.lang.String r1 = ", latencyMillis="
            r0.append(r1)
            long r1 = r3.f5987e
            r0.append(r1)
        L58:
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.mediation.MaxNetworkResponseInfoImpl.toString():java.lang.String");
    }
}
