package com.applovin.impl;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import com.applovin.impl.fe;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.yb;
import com.applovin.sdk.R;

/* loaded from: classes.dex */
public class xf extends yb {

    /* renamed from: n, reason: collision with root package name */
    private final fe f12175n;

    /* renamed from: o, reason: collision with root package name */
    private final Context f12176o;

    public xf(fe feVar, Context context) {
        super(yb.c.DETAIL);
        this.f12175n = feVar;
        this.f12176o = context;
        this.f12370c = t();
        this.f12371d = s();
    }

    private SpannedString q() {
        if (this.f12175n.y()) {
            if (!TextUtils.isEmpty(this.f12175n.c())) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("ADAPTER  ", -7829368));
                spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(this.f12175n.c(), ViewCompat.MEASURED_STATE_MASK));
                if (this.f12175n.z()) {
                    spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSubSpannedString("  LATEST  ", Color.rgb(255, 127, 0)));
                    spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(this.f12175n.k(), ViewCompat.MEASURED_STATE_MASK));
                }
                return new SpannedString(spannableStringBuilder);
            }
            return StringUtils.createListItemDetailSpannedString("Adapter Found", ViewCompat.MEASURED_STATE_MASK);
        }
        return StringUtils.createListItemDetailSpannedString("Adapter Missing", -65536);
    }

    private SpannedString s() {
        if (!o()) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) u());
        spannableStringBuilder.append((CharSequence) new SpannableString("\n"));
        spannableStringBuilder.append((CharSequence) q());
        if (this.f12175n.q() == fe.a.INVALID_INTEGRATION) {
            spannableStringBuilder.append((CharSequence) new SpannableString("\n"));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString("Invalid Integration", -65536));
        }
        return new SpannedString(spannableStringBuilder);
    }

    private SpannedString t() {
        int i9;
        if (o()) {
            i9 = ViewCompat.MEASURED_STATE_MASK;
        } else {
            i9 = -7829368;
        }
        return StringUtils.createSpannedString(this.f12175n.g(), i9, 18, 1);
    }

    private SpannedString u() {
        String str;
        if (this.f12175n.C()) {
            if (StringUtils.isValidString(this.f12175n.p())) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("SDK\t\t\t\t\t  ", -7829368));
                spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(this.f12175n.p(), ViewCompat.MEASURED_STATE_MASK));
                return new SpannedString(spannableStringBuilder);
            }
            if (this.f12175n.y()) {
                str = "Retrieving SDK Version...";
            } else {
                str = "SDK Found";
            }
            return StringUtils.createListItemDetailSpannedString(str, ViewCompat.MEASURED_STATE_MASK);
        }
        return StringUtils.createListItemDetailSpannedString("SDK Missing", -65536);
    }

    @Override // com.applovin.impl.yb
    public int d() {
        if (o()) {
            return R.drawable.applovin_ic_disclosure_arrow;
        }
        return super.h();
    }

    @Override // com.applovin.impl.yb
    public int e() {
        return r3.a(R.color.applovin_sdk_disclosureButtonColor, this.f12176o);
    }

    @Override // com.applovin.impl.yb
    public int h() {
        int h6 = this.f12175n.h();
        if (h6 <= 0) {
            return R.drawable.applovin_ic_mediation_placeholder;
        }
        return h6;
    }

    @Override // com.applovin.impl.yb
    public boolean o() {
        if (this.f12175n.q() != fe.a.MISSING) {
            return true;
        }
        return false;
    }

    public fe r() {
        return this.f12175n;
    }

    public String toString() {
        return "MediatedNetworkListItemViewModel{text=" + ((Object) this.f12370c) + ", detailText=" + ((Object) this.f12371d) + ", network=" + this.f12175n + "}";
    }
}
