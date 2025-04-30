package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import android.util.JsonReader;
import android.util.JsonWriter;
import android.util.Log;
import android.webkit.WebSettings;
import androidx.annotation.Nullable;
import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.ConsentRequestParameters;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzu {
    private final Application zza;
    private final zzab zzb;
    private final Handler zzc;
    private final Executor zzd;
    private final zzap zze;
    private final zzbn zzf;
    private final zzl zzg;
    private final zzx zzh;
    private final zze zzi;

    public zzu(Application application, zzab zzabVar, Handler handler, Executor executor, zzap zzapVar, zzbn zzbnVar, zzl zzlVar, zzx zzxVar, zze zzeVar) {
        this.zza = application;
        this.zzb = zzabVar;
        this.zzc = handler;
        this.zzd = executor;
        this.zze = zzapVar;
        this.zzf = zzbnVar;
        this.zzg = zzlVar;
        this.zzh = zzxVar;
        this.zzi = zzeVar;
    }

    private final zzck zzd(zzci zzciVar) throws zzg {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://fundingchoicesmessages.google.com/a/consent").openConnection();
            httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, WebSettings.getDefaultUserAgent(this.zza));
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(30000);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream(), "UTF-8");
            try {
                JsonWriter jsonWriter = new JsonWriter(outputStreamWriter);
                try {
                    jsonWriter.beginObject();
                    String str = zzciVar.zza;
                    if (str != null) {
                        jsonWriter.name("admob_app_id");
                        jsonWriter.value(str);
                    }
                    zzce zzceVar = zzciVar.zzb;
                    if (zzceVar != null) {
                        jsonWriter.name("device_info");
                        jsonWriter.beginObject();
                        int i9 = zzceVar.zzc;
                        if (i9 != 1) {
                            jsonWriter.name("os_type");
                            int i10 = i9 - 1;
                            if (i10 != 0) {
                                if (i10 == 1) {
                                    jsonWriter.value("ANDROID");
                                }
                            } else {
                                jsonWriter.value("UNKNOWN");
                            }
                        }
                        String str2 = zzceVar.zza;
                        if (str2 != null) {
                            jsonWriter.name("model");
                            jsonWriter.value(str2);
                        }
                        Integer num = zzceVar.zzb;
                        if (num != null) {
                            jsonWriter.name("android_api_level");
                            jsonWriter.value(num);
                        }
                        jsonWriter.endObject();
                    }
                    String str3 = zzciVar.zzc;
                    if (str3 != null) {
                        jsonWriter.name("language_code");
                        jsonWriter.value(str3);
                    }
                    Boolean bool = zzciVar.zzd;
                    if (bool != null) {
                        jsonWriter.name("tag_for_under_age_of_consent");
                        jsonWriter.value(bool.booleanValue());
                    }
                    Map map = zzciVar.zze;
                    if (!map.isEmpty()) {
                        jsonWriter.name("stored_infos_map");
                        jsonWriter.beginObject();
                        for (Map.Entry entry : map.entrySet()) {
                            jsonWriter.name((String) entry.getKey());
                            jsonWriter.value((String) entry.getValue());
                        }
                        jsonWriter.endObject();
                    }
                    zzcg zzcgVar = zzciVar.zzf;
                    if (zzcgVar != null) {
                        jsonWriter.name("screen_info");
                        jsonWriter.beginObject();
                        Integer num2 = zzcgVar.zza;
                        if (num2 != null) {
                            jsonWriter.name("width");
                            jsonWriter.value(num2);
                        }
                        Integer num3 = zzcgVar.zzb;
                        if (num3 != null) {
                            jsonWriter.name("height");
                            jsonWriter.value(num3);
                        }
                        Double d2 = zzcgVar.zzc;
                        if (d2 != null) {
                            jsonWriter.name("density");
                            jsonWriter.value(d2);
                        }
                        List<zzcf> list = zzcgVar.zzd;
                        if (!list.isEmpty()) {
                            jsonWriter.name("screen_insets");
                            jsonWriter.beginArray();
                            for (zzcf zzcfVar : list) {
                                jsonWriter.beginObject();
                                Integer num4 = zzcfVar.zza;
                                if (num4 != null) {
                                    jsonWriter.name("top");
                                    jsonWriter.value(num4);
                                }
                                Integer num5 = zzcfVar.zzb;
                                if (num5 != null) {
                                    jsonWriter.name(TtmlNode.LEFT);
                                    jsonWriter.value(num5);
                                }
                                Integer num6 = zzcfVar.zzc;
                                if (num6 != null) {
                                    jsonWriter.name(TtmlNode.RIGHT);
                                    jsonWriter.value(num6);
                                }
                                Integer num7 = zzcfVar.zzd;
                                if (num7 != null) {
                                    jsonWriter.name("bottom");
                                    jsonWriter.value(num7);
                                }
                                jsonWriter.endObject();
                            }
                            jsonWriter.endArray();
                        }
                        jsonWriter.endObject();
                    }
                    zzcc zzccVar = zzciVar.zzg;
                    if (zzccVar != null) {
                        jsonWriter.name("app_info");
                        jsonWriter.beginObject();
                        String str4 = zzccVar.zza;
                        if (str4 != null) {
                            jsonWriter.name(CampaignEx.JSON_KEY_PACKAGE_NAME);
                            jsonWriter.value(str4);
                        }
                        String str5 = zzccVar.zzb;
                        if (str5 != null) {
                            jsonWriter.name("publisher_display_name");
                            jsonWriter.value(str5);
                        }
                        String str6 = zzccVar.zzc;
                        if (str6 != null) {
                            jsonWriter.name("version");
                            jsonWriter.value(str6);
                        }
                        jsonWriter.endObject();
                    }
                    zzch zzchVar = zzciVar.zzh;
                    if (zzchVar != null) {
                        jsonWriter.name("sdk_info");
                        jsonWriter.beginObject();
                        String str7 = zzchVar.zza;
                        if (str7 != null) {
                            jsonWriter.name("version");
                            jsonWriter.value(str7);
                        }
                        jsonWriter.endObject();
                    }
                    List list2 = zzciVar.zzi;
                    if (!list2.isEmpty()) {
                        jsonWriter.name("debug_params");
                        jsonWriter.beginArray();
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            int ordinal = ((zzcd) it.next()).ordinal();
                            if (ordinal != 0) {
                                if (ordinal != 1) {
                                    if (ordinal != 2) {
                                        if (ordinal != 3) {
                                            if (ordinal == 4) {
                                                jsonWriter.value("PREVIEWING_DEBUG_MESSAGES");
                                            }
                                        } else {
                                            jsonWriter.value("GEO_OVERRIDE_NON_EEA");
                                        }
                                    } else {
                                        jsonWriter.value("GEO_OVERRIDE_EEA");
                                    }
                                } else {
                                    jsonWriter.value("ALWAYS_SHOW");
                                }
                            } else {
                                jsonWriter.value("DEBUG_PARAM_UNKNOWN");
                            }
                        }
                        jsonWriter.endArray();
                    }
                    jsonWriter.endObject();
                    jsonWriter.close();
                    outputStreamWriter.close();
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode == 200) {
                        String headerField = httpURLConnection.getHeaderField("x-ump-using-header");
                        if (headerField != null) {
                            zzck zza = zzck.zza(new JsonReader(new StringReader(headerField)));
                            zza.zza = new Scanner(httpURLConnection.getInputStream()).useDelimiter("\\A").next();
                            return zza;
                        }
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
                        try {
                            bufferedReader.readLine();
                            JsonReader jsonReader = new JsonReader(bufferedReader);
                            try {
                                zzck zza2 = zzck.zza(jsonReader);
                                jsonReader.close();
                                bufferedReader.close();
                                return zza2;
                            } finally {
                            }
                        } catch (Throwable th) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    throw new IOException("Http error code - " + responseCode + ".\n" + new Scanner(httpURLConnection.getErrorStream()).useDelimiter("\\A").next());
                } finally {
                }
            } catch (Throwable th3) {
                try {
                    outputStreamWriter.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (SocketTimeoutException e4) {
            throw new zzg(4, "The server timed out.", e4);
        } catch (IOException e9) {
            throw new zzg(2, "Error making request.", e9);
        }
    }

    public final /* synthetic */ void zza(final ConsentInformation.OnConsentInfoUpdateSuccessListener onConsentInfoUpdateSuccessListener, zzz zzzVar) {
        Objects.requireNonNull(onConsentInfoUpdateSuccessListener);
        this.zzc.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzt
            @Override // java.lang.Runnable
            public final void run() {
                ConsentInformation.OnConsentInfoUpdateSuccessListener.this.onConsentInfoUpdateSuccess();
            }
        });
        if (zzzVar.zzb != ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED) {
            this.zzf.zzc();
        }
    }

    public final /* synthetic */ void zzb(Activity activity, ConsentRequestParameters consentRequestParameters, final ConsentInformation.OnConsentInfoUpdateSuccessListener onConsentInfoUpdateSuccessListener, final ConsentInformation.OnConsentInfoUpdateFailureListener onConsentInfoUpdateFailureListener) {
        try {
            ConsentDebugSettings consentDebugSettings = consentRequestParameters.getConsentDebugSettings();
            if (consentDebugSettings != null) {
                if (!consentDebugSettings.isTestDevice()) {
                }
                final zzz zza = new zzw(this.zzh, zzd(this.zzg.zzc(activity, consentRequestParameters))).zza();
                this.zze.zzg(zza.zza);
                this.zze.zzh(zza.zzb);
                this.zzf.zzd(zza.zzc);
                this.zzi.zza().execute(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzp
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzu.this.zza(onConsentInfoUpdateSuccessListener, zza);
                    }
                });
            }
            Log.i("UserMessagingPlatform", "Use new ConsentDebugSettings.Builder().addTestDeviceHashedId(\"" + zzcl.zza(this.zza) + "\") to set this as a debug device.");
            final zzz zza2 = new zzw(this.zzh, zzd(this.zzg.zzc(activity, consentRequestParameters))).zza();
            this.zze.zzg(zza2.zza);
            this.zze.zzh(zza2.zzb);
            this.zzf.zzd(zza2.zzc);
            this.zzi.zza().execute(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzp
                @Override // java.lang.Runnable
                public final void run() {
                    zzu.this.zza(onConsentInfoUpdateSuccessListener, zza2);
                }
            });
        } catch (zzg e4) {
            this.zzc.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzr
                @Override // java.lang.Runnable
                public final void run() {
                    ConsentInformation.OnConsentInfoUpdateFailureListener.this.onConsentInfoUpdateFailure(e4.zza());
                }
            });
        } catch (RuntimeException e9) {
            final zzg zzgVar = new zzg(1, "Caught exception when trying to request consent info update: ".concat(String.valueOf(Log.getStackTraceString(e9))));
            this.zzc.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzs
                @Override // java.lang.Runnable
                public final void run() {
                    ConsentInformation.OnConsentInfoUpdateFailureListener.this.onConsentInfoUpdateFailure(zzgVar.zza());
                }
            });
        }
    }

    public final void zzc(@Nullable final Activity activity, final ConsentRequestParameters consentRequestParameters, final ConsentInformation.OnConsentInfoUpdateSuccessListener onConsentInfoUpdateSuccessListener, final ConsentInformation.OnConsentInfoUpdateFailureListener onConsentInfoUpdateFailureListener) {
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzq
            @Override // java.lang.Runnable
            public final void run() {
                zzu.this.zzb(activity, consentRequestParameters, onConsentInfoUpdateSuccessListener, onConsentInfoUpdateFailureListener);
            }
        });
    }
}
