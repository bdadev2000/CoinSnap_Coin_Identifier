package com.applovin.impl;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import com.applovin.impl.dc;
import com.applovin.impl.ke;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.R;
import org.objectweb.asm.Opcodes;

/* loaded from: classes3.dex */
public class cg extends dc {

    /* renamed from: n, reason: collision with root package name */
    private final ke f23274n;

    /* renamed from: o, reason: collision with root package name */
    private final Context f23275o;

    public cg(ke keVar, Context context) {
        super(dc.c.DETAIL);
        this.f23274n = keVar;
        this.f23275o = context;
        this.f23448c = t();
        this.d = s();
    }

    private SpannedString q() {
        if (!this.f23274n.z()) {
            return StringUtils.createListItemDetailSpannedString("Adapter Missing", Opcodes.V_PREVIEW);
        }
        if (TextUtils.isEmpty(this.f23274n.c())) {
            return StringUtils.createListItemDetailSpannedString("Adapter Found", -16777216);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("ADAPTER  ", -7829368));
        spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(this.f23274n.c(), -16777216));
        if (this.f23274n.A()) {
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSubSpannedString("  LATEST  ", Color.rgb(255, 127, 0)));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(this.f23274n.k(), -16777216));
        }
        return new SpannedString(spannableStringBuilder);
    }

    private SpannedString s() {
        if (!o()) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) u());
        spannableStringBuilder.append((CharSequence) new SpannableString("\n"));
        spannableStringBuilder.append((CharSequence) q());
        if (this.f23274n.q() == ke.a.INVALID_INTEGRATION) {
            spannableStringBuilder.append((CharSequence) new SpannableString("\n"));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString("Invalid Integration", Opcodes.V_PREVIEW));
        }
        return new SpannedString(spannableStringBuilder);
    }

    private SpannedString t() {
        return StringUtils.createSpannedString(this.f23274n.g(), o() ? -16777216 : -7829368, 18, 1);
    }

    private SpannedString u() {
        if (!this.f23274n.D()) {
            return StringUtils.createListItemDetailSpannedString("SDK Missing", Opcodes.V_PREVIEW);
        }
        if (!StringUtils.isValidString(this.f23274n.p())) {
            return StringUtils.createListItemDetailSpannedString(this.f23274n.z() ? "Retrieving SDK Version..." : "SDK Found", -16777216);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("SDK\t\t\t\t\t  ", -7829368));
        spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(this.f23274n.p(), -16777216));
        return new SpannedString(spannableStringBuilder);
    }

    @Override // com.applovin.impl.dc
    public int d() {
        return o() ? R.drawable.applovin_ic_disclosure_arrow : super.h();
    }

    @Override // com.applovin.impl.dc
    public int e() {
        return t3.a(R.color.applovin_sdk_disclosureButtonColor, this.f23275o);
    }

    @Override // com.applovin.impl.dc
    public int h() {
        int h2 = this.f23274n.h();
        return h2 > 0 ? h2 : R.drawable.applovin_ic_mediation_placeholder;
    }

    @Override // com.applovin.impl.dc
    public boolean o() {
        return this.f23274n.q() != ke.a.MISSING;
    }

    public ke r() {
        return this.f23274n;
    }

    public String toString() {
        return "MediatedNetworkListItemViewModel{text=" + ((Object) this.f23448c) + ", detailText=" + ((Object) this.d) + ", network=" + this.f23274n + "}";
    }
}
