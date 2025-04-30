package i6;

import E1.c;
import G7.j;
import U4.C0314j;
import android.util.Log;
import com.facebook.appevents.g;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;

/* renamed from: i6.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2362a implements ConsentInformation.OnConsentInfoUpdateSuccessListener, ConsentInformation.OnConsentInfoUpdateFailureListener, UserMessagingPlatform.OnConsentFormLoadFailureListener {
    public final /* synthetic */ c b;

    public /* synthetic */ C2362a(c cVar) {
        this.b = cVar;
    }

    @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener
    public void onConsentFormLoadFailure(FormError formError) {
        c cVar = this.b;
        j.e(cVar, "$callback");
        j.d(formError, "formError");
        cVar.u(formError);
    }

    @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateFailureListener
    public void onConsentInfoUpdateFailure(FormError formError) {
        c cVar = this.b;
        j.e(cVar, "$callback");
        j.d(formError, "formError");
        cVar.u(formError);
    }

    @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateSuccessListener
    public void onConsentInfoUpdateSuccess() {
        c cVar = this.b;
        j.e(cVar, "$callback");
        Log.v("ITGAdConsent", "requestConsentInfoUpdate success");
        ConsentInformation consentInformation = g.b;
        if (consentInformation != null && consentInformation.isConsentFormAvailable()) {
            ConsentInformation consentInformation2 = g.b;
            j.b(consentInformation2);
            UserMessagingPlatform.loadConsentForm(cVar.t(), new C0314j(cVar, consentInformation2), new C2362a(cVar));
            return;
        }
        cVar.y();
    }
}
