package ic;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.ump.ConsentInformation;

/* loaded from: classes3.dex */
public final /* synthetic */ class p implements OnSuccessListener, ConsentInformation.OnConsentInfoUpdateSuccessListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f19568b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f19569c;

    public /* synthetic */ p(ag.b bVar) {
        this.f19568b = true;
        this.f19569c = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r1.isConsentFormAvailable() == true) goto L8;
     */
    @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateSuccessListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onConsentInfoUpdateSuccess() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f19569c
            de.a r0 = (de.a) r0
            java.lang.String r1 = "$callback"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r1 = "ITGAdConsent"
            java.lang.String r2 = "requestConsentInfoUpdate success"
            android.util.Log.v(r1, r2)
            com.google.android.ump.ConsentInformation r1 = com.bumptech.glide.c.a
            if (r1 == 0) goto L1c
            boolean r1 = r1.isConsentFormAvailable()
            r2 = 1
            if (r1 != r2) goto L1c
            goto L1d
        L1c:
            r2 = 0
        L1d:
            if (r2 == 0) goto L3a
            com.google.android.ump.ConsentInformation r1 = com.bumptech.glide.c.a
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            ag.b r0 = (ag.b) r0
            pf.f r2 = r0.b()
            com.applovin.impl.sdk.ad.f r3 = new com.applovin.impl.sdk.ad.f
            boolean r4 = r5.f19568b
            r3.<init>(r1, r0, r4)
            de.b r1 = new de.b
            r1.<init>(r0)
            com.google.android.ump.UserMessagingPlatform.loadConsentForm(r2, r3, r1)
            goto L3f
        L3a:
            ag.b r0 = (ag.b) r0
            r0.d()
        L3f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ic.p.onConsentInfoUpdateSuccess():void");
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        SharedPreferences.Editor edit = com.facebook.appevents.g.n((Context) this.f19569c).edit();
        edit.putBoolean("proxy_retention", this.f19568b);
        edit.apply();
    }

    public /* synthetic */ p(Context context, boolean z10) {
        this.f19569c = context;
        this.f19568b = z10;
    }
}
