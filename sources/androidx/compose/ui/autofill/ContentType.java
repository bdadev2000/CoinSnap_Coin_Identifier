package androidx.compose.ui.autofill;

import androidx.compose.runtime.internal.StabilityInferred;
import b1.f0;
import com.applovin.sdk.AppLovinEventParameters;
import java.util.Set;

@StabilityInferred
/* loaded from: classes3.dex */
public final class ContentType {

    /* renamed from: a, reason: collision with root package name */
    public final Set f14741a;

    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    static {
        new ContentType(AppLovinEventParameters.USER_ACCOUNT_IDENTIFIER);
        new ContentType("password");
        new ContentType("emailAddress");
        new ContentType("newUsername");
        new ContentType("newPassword");
        new ContentType("postalAddress");
        new ContentType("postalCode");
        new ContentType("creditCardNumber");
        new ContentType("creditCardSecurityCode");
        new ContentType("creditCardExpirationDate");
        new ContentType("creditCardExpirationMonth");
        new ContentType("creditCardExpirationYear");
        new ContentType("creditCardExpirationDay");
        new ContentType("addressCountry");
        new ContentType("addressRegion");
        new ContentType("addressLocality");
        new ContentType("streetAddress");
        new ContentType("extendedAddress");
        new ContentType("extendedPostalCode");
        new ContentType("personName");
        new ContentType("personGivenName");
        new ContentType("personFamilyName");
        new ContentType("personMiddleName");
        new ContentType("personMiddleInitial");
        new ContentType("personNamePrefix");
        new ContentType("personNameSuffix");
        new ContentType("phoneNumber");
        new ContentType("phoneNumberDevice");
        new ContentType("phoneCountryCode");
        new ContentType("phoneNational");
        new ContentType("gender");
        new ContentType("birthDateFull");
        new ContentType("birthDateDay");
        new ContentType("birthDateMonth");
        new ContentType("birthDateYear");
        new ContentType("smsOTPCode");
    }

    public ContentType(String str) {
        this.f14741a = f0.B(str);
    }
}
