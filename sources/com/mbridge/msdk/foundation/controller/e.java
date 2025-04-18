package com.mbridge.msdk.foundation.controller;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ad;

/* loaded from: classes4.dex */
public final class e implements SharedPreferences.OnSharedPreferenceChangeListener {
    private String a;

    /* renamed from: e, reason: collision with root package name */
    private int f13068e;

    /* renamed from: g, reason: collision with root package name */
    private boolean f13070g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f13071h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f13072i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f13073j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f13074k;

    /* renamed from: l, reason: collision with root package name */
    private a f13075l;

    /* renamed from: m, reason: collision with root package name */
    private final SharedPreferences f13076m;

    /* renamed from: b, reason: collision with root package name */
    private String f13065b = "";

    /* renamed from: c, reason: collision with root package name */
    private String f13066c = "";

    /* renamed from: d, reason: collision with root package name */
    private String f13067d = "";

    /* renamed from: f, reason: collision with root package name */
    private boolean f13069f = false;

    /* loaded from: classes4.dex */
    public interface a {
        void a();
    }

    public e(Context context) {
        this.a = "";
        this.f13068e = 0;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        this.f13076m = defaultSharedPreferences;
        if (defaultSharedPreferences != null) {
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this);
        }
        if (defaultSharedPreferences != null) {
            this.a = defaultSharedPreferences.getString("IABTCF_TCString", "");
            this.f13068e = defaultSharedPreferences.getInt("IABTCF_gdprApplies", 0);
            a(defaultSharedPreferences.getString("IABTCF_PurposeConsents", ""));
            b(defaultSharedPreferences.getString("IABTCF_VendorConsents", ""));
            c(defaultSharedPreferences.getString("IABTCF_AddtlConsent", ""));
        }
    }

    private void b(String str) {
        this.f13072i = a(str, 867);
        this.f13066c = str;
    }

    private void c(String str) {
        this.f13067d = str;
        if (TextUtils.isEmpty(str)) {
            this.f13073j = true;
            return;
        }
        if (MBridgeConstans.GOOGLE_ATP_ID == -1) {
            this.f13074k = false;
            return;
        }
        this.f13074k = true;
        try {
            String[] split = str.split("~");
            if (split.length > 1) {
                if (TextUtils.isEmpty(split[1])) {
                    this.f13073j = false;
                } else {
                    this.f13073j = str.contains(String.valueOf(MBridgeConstans.GOOGLE_ATP_ID));
                }
            }
        } catch (Throwable th2) {
            ad.b("TCStringManager", th2.getMessage());
        }
    }

    private boolean d(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str.matches("[01]+");
        }
        return false;
    }

    public final void a(a aVar) {
        if (aVar != null) {
            this.f13075l = aVar;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        char c10;
        try {
            if (!TextUtils.isEmpty(str)) {
                switch (str.hashCode()) {
                    case -2004976699:
                        if (str.equals("IABTCF_PurposeConsents")) {
                            c10 = 2;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 83641339:
                        if (str.equals("IABTCF_gdprApplies")) {
                            c10 = 1;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1218895378:
                        if (str.equals("IABTCF_TCString")) {
                            c10 = 0;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1342914771:
                        if (str.equals("IABTCF_AddtlConsent")) {
                            c10 = 4;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1450203731:
                        if (str.equals("IABTCF_VendorConsents")) {
                            c10 = 3;
                            break;
                        }
                        c10 = 65535;
                        break;
                    default:
                        c10 = 65535;
                        break;
                }
                if (c10 != 0) {
                    if (c10 != 1) {
                        if (c10 != 2) {
                            if (c10 != 3) {
                                if (c10 == 4) {
                                    c(sharedPreferences.getString("IABTCF_AddtlConsent", ""));
                                }
                            } else {
                                b(sharedPreferences.getString("IABTCF_VendorConsents", ""));
                            }
                        } else {
                            a(sharedPreferences.getString("IABTCF_PurposeConsents", ""));
                        }
                    } else {
                        this.f13068e = sharedPreferences.getInt("IABTCF_gdprApplies", 0);
                    }
                } else {
                    this.a = sharedPreferences.getString("IABTCF_TCString", "");
                }
                a aVar = this.f13075l;
                if (aVar != null) {
                    aVar.a();
                }
            }
        } catch (Throwable th2) {
            ad.b("TCStringManager", th2.getMessage());
        }
    }

    public final String a() {
        return this.a;
    }

    private void a(String str) {
        this.f13070g = a(str, 1);
        this.f13071h = a(str, 2);
        this.f13065b = str;
    }

    public final boolean b() {
        if (this.f13068e == 0) {
            this.f13069f = true;
            return true;
        }
        if (d(this.f13065b) && d(this.f13066c)) {
            if (MBridgeConstans.VERIFY_ATP_CONSENT) {
                this.f13069f = (this.f13072i || (this.f13074k && this.f13073j)) && this.f13070g && this.f13071h;
                return this.f13069f;
            }
            if (!this.f13072i || !this.f13070g || !this.f13071h) {
                r1 = false;
            }
        }
        this.f13069f = r1;
        return this.f13069f;
    }

    private boolean a(String str, int i10) {
        return d(str) && i10 <= str.length() && i10 >= 1 && '1' == str.charAt(i10 - 1);
    }
}
