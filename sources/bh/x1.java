package bh;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* loaded from: classes4.dex */
public final class x1 {
    public static final w1 Companion = new w1(null);
    private final String buttonAccept;
    private final String buttonDeny;
    private final String consentMessage;
    private final String consentMessageVersion;
    private final String consentTitle;
    private final boolean isCountryDataProtected;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ x1(int i10, @SerialName("is_country_data_protected") boolean z10, @SerialName("consent_title") String str, @SerialName("consent_message") String str2, @SerialName("consent_message_version") String str3, @SerialName("button_accept") String str4, @SerialName("button_deny") String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i10 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 63, v1.INSTANCE.getDescriptor());
        }
        this.isCountryDataProtected = z10;
        this.consentTitle = str;
        this.consentMessage = str2;
        this.consentMessageVersion = str3;
        this.buttonAccept = str4;
        this.buttonDeny = str5;
    }

    public static /* synthetic */ x1 copy$default(x1 x1Var, boolean z10, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = x1Var.isCountryDataProtected;
        }
        if ((i10 & 2) != 0) {
            str = x1Var.consentTitle;
        }
        String str6 = str;
        if ((i10 & 4) != 0) {
            str2 = x1Var.consentMessage;
        }
        String str7 = str2;
        if ((i10 & 8) != 0) {
            str3 = x1Var.consentMessageVersion;
        }
        String str8 = str3;
        if ((i10 & 16) != 0) {
            str4 = x1Var.buttonAccept;
        }
        String str9 = str4;
        if ((i10 & 32) != 0) {
            str5 = x1Var.buttonDeny;
        }
        return x1Var.copy(z10, str6, str7, str8, str9, str5);
    }

    @SerialName("button_accept")
    public static /* synthetic */ void getButtonAccept$annotations() {
    }

    @SerialName("button_deny")
    public static /* synthetic */ void getButtonDeny$annotations() {
    }

    @SerialName("consent_message")
    public static /* synthetic */ void getConsentMessage$annotations() {
    }

    @SerialName("consent_message_version")
    public static /* synthetic */ void getConsentMessageVersion$annotations() {
    }

    @SerialName("consent_title")
    public static /* synthetic */ void getConsentTitle$annotations() {
    }

    @SerialName("is_country_data_protected")
    public static /* synthetic */ void isCountryDataProtected$annotations() {
    }

    @JvmStatic
    public static final void write$Self(x1 self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeBooleanElement(serialDesc, 0, self.isCountryDataProtected);
        output.encodeStringElement(serialDesc, 1, self.consentTitle);
        output.encodeStringElement(serialDesc, 2, self.consentMessage);
        output.encodeStringElement(serialDesc, 3, self.consentMessageVersion);
        output.encodeStringElement(serialDesc, 4, self.buttonAccept);
        output.encodeStringElement(serialDesc, 5, self.buttonDeny);
    }

    public final boolean component1() {
        return this.isCountryDataProtected;
    }

    public final String component2() {
        return this.consentTitle;
    }

    public final String component3() {
        return this.consentMessage;
    }

    public final String component4() {
        return this.consentMessageVersion;
    }

    public final String component5() {
        return this.buttonAccept;
    }

    public final String component6() {
        return this.buttonDeny;
    }

    public final x1 copy(boolean z10, String consentTitle, String consentMessage, String consentMessageVersion, String buttonAccept, String buttonDeny) {
        Intrinsics.checkNotNullParameter(consentTitle, "consentTitle");
        Intrinsics.checkNotNullParameter(consentMessage, "consentMessage");
        Intrinsics.checkNotNullParameter(consentMessageVersion, "consentMessageVersion");
        Intrinsics.checkNotNullParameter(buttonAccept, "buttonAccept");
        Intrinsics.checkNotNullParameter(buttonDeny, "buttonDeny");
        return new x1(z10, consentTitle, consentMessage, consentMessageVersion, buttonAccept, buttonDeny);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1)) {
            return false;
        }
        x1 x1Var = (x1) obj;
        return this.isCountryDataProtected == x1Var.isCountryDataProtected && Intrinsics.areEqual(this.consentTitle, x1Var.consentTitle) && Intrinsics.areEqual(this.consentMessage, x1Var.consentMessage) && Intrinsics.areEqual(this.consentMessageVersion, x1Var.consentMessageVersion) && Intrinsics.areEqual(this.buttonAccept, x1Var.buttonAccept) && Intrinsics.areEqual(this.buttonDeny, x1Var.buttonDeny);
    }

    public final String getButtonAccept() {
        return this.buttonAccept;
    }

    public final String getButtonDeny() {
        return this.buttonDeny;
    }

    public final String getConsentMessage() {
        return this.consentMessage;
    }

    public final String getConsentMessageVersion() {
        return this.consentMessageVersion;
    }

    public final String getConsentTitle() {
        return this.consentTitle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public int hashCode() {
        boolean z10 = this.isCountryDataProtected;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        return this.buttonDeny.hashCode() + vd.e.c(this.buttonAccept, vd.e.c(this.consentMessageVersion, vd.e.c(this.consentMessage, vd.e.c(this.consentTitle, r02 * 31, 31), 31), 31), 31);
    }

    public final boolean isCountryDataProtected() {
        return this.isCountryDataProtected;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("GDPRSettings(isCountryDataProtected=");
        sb2.append(this.isCountryDataProtected);
        sb2.append(", consentTitle=");
        sb2.append(this.consentTitle);
        sb2.append(", consentMessage=");
        sb2.append(this.consentMessage);
        sb2.append(", consentMessageVersion=");
        sb2.append(this.consentMessageVersion);
        sb2.append(", buttonAccept=");
        sb2.append(this.buttonAccept);
        sb2.append(", buttonDeny=");
        return com.applovin.impl.mediation.ads.e.g(sb2, this.buttonDeny, ')');
    }

    public x1(boolean z10, String consentTitle, String consentMessage, String consentMessageVersion, String buttonAccept, String buttonDeny) {
        Intrinsics.checkNotNullParameter(consentTitle, "consentTitle");
        Intrinsics.checkNotNullParameter(consentMessage, "consentMessage");
        Intrinsics.checkNotNullParameter(consentMessageVersion, "consentMessageVersion");
        Intrinsics.checkNotNullParameter(buttonAccept, "buttonAccept");
        Intrinsics.checkNotNullParameter(buttonDeny, "buttonDeny");
        this.isCountryDataProtected = z10;
        this.consentTitle = consentTitle;
        this.consentMessage = consentMessage;
        this.consentMessageVersion = consentMessageVersion;
        this.buttonAccept = buttonAccept;
        this.buttonDeny = buttonDeny;
    }
}
