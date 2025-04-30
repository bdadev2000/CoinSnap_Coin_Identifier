package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import java.io.ByteArrayOutputStream;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzca implements zzd {
    private final Application zza;
    private final zzbw zzb;
    private final Handler zzc;
    private final Executor zzd;
    private final zze zze;
    private final zzan zzf;
    private final zzbb zzg;
    private final zzap zzh;

    public zzca(Application application, zzbw zzbwVar, Handler handler, Executor executor, zze zzeVar, zzan zzanVar, zzbb zzbbVar, zzap zzapVar) {
        this.zza = application;
        this.zzb = zzbwVar;
        this.zzc = handler;
        this.zzd = executor;
        this.zze = zzeVar;
        this.zzf = zzanVar;
        this.zzg = zzbbVar;
        this.zzh = zzapVar;
    }

    private final void zzg(JSONObject jSONObject) {
        String optString = jSONObject.optString("url");
        if (TextUtils.isEmpty(optString)) {
            Log.d("UserMessagingPlatform", "Action[browser]: empty url.");
        }
        Uri parse = Uri.parse(optString);
        if (parse.getScheme() == null) {
            Log.d("UserMessagingPlatform", "Action[browser]: empty scheme: ".concat(String.valueOf(optString)));
        }
        try {
            this.zzb.startActivity(new Intent("android.intent.action.VIEW", parse));
        } catch (ActivityNotFoundException e4) {
            Log.d("UserMessagingPlatform", "Action[browser]: can not open url: ".concat(String.valueOf(optString)), e4);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzd
    public final Executor zza() {
        final Handler handler = this.zzc;
        Objects.requireNonNull(handler);
        return new Executor() { // from class: com.google.android.gms.internal.consent_sdk.zzby
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.consent_sdk.zzd
    public final boolean zzb(String str, JSONObject jSONObject) {
        char c9;
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1370505102:
                if (str.equals("load_complete")) {
                    c9 = 0;
                    break;
                }
                c9 = 65535;
                break;
            case -278739366:
                if (str.equals("configure_app_assets")) {
                    c9 = 3;
                    break;
                }
                c9 = 65535;
                break;
            case 150940456:
                if (str.equals("browser")) {
                    c9 = 2;
                    break;
                }
                c9 = 65535;
                break;
            case 1671672458:
                if (str.equals("dismiss")) {
                    c9 = 1;
                    break;
                }
                c9 = 65535;
                break;
            default:
                c9 = 65535;
                break;
        }
        if (c9 != 0) {
            if (c9 != 1) {
                if (c9 != 2) {
                    if (c9 != 3) {
                        return false;
                    }
                    zzc();
                    return true;
                }
                zzg(jSONObject);
                return true;
            }
            String optString = jSONObject.optString(NotificationCompat.CATEGORY_STATUS);
            switch (optString.hashCode()) {
                case -954325659:
                    if (optString.equals("CONSENT_SIGNAL_NON_PERSONALIZED_ADS")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case -258041904:
                    if (optString.equals("personalized")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 429411856:
                    if (optString.equals("CONSENT_SIGNAL_SUFFICIENT")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 467888915:
                    if (optString.equals("CONSENT_SIGNAL_PERSONALIZED_ADS")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 1666911234:
                    if (optString.equals("non_personalized")) {
                        c10 = 2;
                        break;
                    }
                    break;
            }
            if (c10 != 0 && c10 != 1 && c10 != 2 && c10 != 3 && c10 != 4) {
                this.zzg.zzd(new zzg(1, "We are getting something wrong with the webview."));
            } else {
                this.zzg.zzc(3);
            }
            return true;
        }
        this.zzg.zze();
        return true;
    }

    public final void zzc() {
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbz
            @Override // java.lang.Runnable
            public final void run() {
                zzca.this.zzd();
            }
        });
    }

    public final /* synthetic */ void zzd() {
        String concat;
        JSONObject jSONObject = new JSONObject();
        Application application = this.zza;
        try {
            jSONObject.put("app_name", application.getPackageManager().getApplicationLabel(application.getApplicationInfo()).toString());
            Drawable applicationIcon = application.getPackageManager().getApplicationIcon(application.getApplicationInfo());
            if (applicationIcon == null) {
                concat = null;
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(applicationIcon.getIntrinsicWidth(), applicationIcon.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                applicationIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                applicationIcon.draw(canvas);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                concat = "data:image/png;base64,".concat(String.valueOf(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2)));
            }
            jSONObject.put("app_icon", concat);
            jSONObject.put("stored_infos_map", this.zzh.zzc());
        } catch (JSONException unused) {
        }
        this.zzg.zza().zzd("UMP_configureFormWithAppAssets", jSONObject.toString());
    }

    public final void zze(String str) {
        Log.d("UserMessagingPlatform", "Receive consent action: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        this.zze.zzb(parse.getQueryParameter("action"), parse.getQueryParameter("args"), this, this.zzf);
    }

    public final void zzf(int i9, String str, String str2) {
        Locale locale = Locale.US;
        this.zzg.zzf(new zzg(2, "WebResourceError(" + i9 + ", " + str2 + "): " + str));
    }
}
