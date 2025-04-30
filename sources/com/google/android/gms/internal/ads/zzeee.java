package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.util.IOUtils;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzeee implements zzfkw {
    protected final Context zza;
    protected final String zzb;
    protected final zzbyd zzc;

    public zzeee(Context context, String str, zzbyd zzbydVar, int i9) {
        this.zza = context;
        this.zzb = str;
        this.zzc = zzbydVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.net.HttpURLConnection, java.net.URLConnection] */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.io.OutputStream, java.io.Closeable, java.io.BufferedOutputStream] */
    /* JADX WARN: Type inference failed for: r6v2, types: [com.google.android.gms.ads.internal.util.zzt] */
    /* JADX WARN: Type inference failed for: r6v7, types: [com.google.android.gms.ads.internal.util.client.zzl] */
    @Override // com.google.android.gms.internal.ads.zzfkw
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzeed zza(zzeec zzeecVar) throws zzdzd {
        ?? r12;
        zzeed zzeedVar;
        InputStreamReader inputStreamReader;
        ?? zzlVar;
        int responseCode;
        ?? bufferedOutputStream;
        zzeee zzeeeVar = this;
        String str = zzeecVar.zza;
        int i9 = zzeecVar.zzb;
        Map map = zzeecVar.zzc;
        byte[] bArr = zzeecVar.zzd;
        String str2 = zzeecVar.zze;
        long elapsedRealtime = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime();
        boolean z8 = true;
        try {
            zzeed zzeedVar2 = new zzeed();
            com.google.android.gms.ads.internal.util.client.zzm.zzi("SDK version: " + zzeeeVar.zzb);
            com.google.android.gms.ads.internal.util.client.zzm.zze("AdRequestServiceImpl: Sending request: " + str);
            URL url = new URL(str);
            HashMap hashMap = new HashMap();
            int i10 = 0;
            while (true) {
                ?? r32 = (HttpURLConnection) url.openConnection();
                try {
                    ?? zzp = com.google.android.gms.ads.internal.zzu.zzp();
                    Context context = zzeeeVar.zza;
                    String str3 = zzeeeVar.zzb;
                    zzeed zzeedVar3 = zzeedVar2;
                    r12 = z8;
                    try {
                        try {
                            zzp.zzf(context, str3, false, r32, false, i9);
                            for (Map.Entry entry : map.entrySet()) {
                                r32.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                            }
                            if (!TextUtils.isEmpty(str2)) {
                                r32.setRequestProperty("Content-Type", str2);
                            }
                            int length = bArr.length;
                            inputStreamReader = null;
                            if (length > 0) {
                                r32.setDoOutput(r12);
                                r32.setFixedLengthStreamingMode(length);
                                try {
                                    bufferedOutputStream = new BufferedOutputStream(r32.getOutputStream());
                                } catch (Throwable th) {
                                    th = th;
                                }
                                try {
                                    bufferedOutputStream.write(bArr);
                                    IOUtils.closeQuietly((Closeable) bufferedOutputStream);
                                } catch (Throwable th2) {
                                    th = th2;
                                    inputStreamReader = bufferedOutputStream;
                                    IOUtils.closeQuietly(inputStreamReader);
                                    throw th;
                                }
                            }
                            zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
                            zzlVar.zzc(r32, bArr);
                            responseCode = r32.getResponseCode();
                            for (Map.Entry<String, List<String>> entry2 : r32.getHeaderFields().entrySet()) {
                                String key = entry2.getKey();
                                List<String> value = entry2.getValue();
                                if (hashMap.containsKey(key)) {
                                    ((List) hashMap.get(key)).addAll(value);
                                } else {
                                    hashMap.put(key, new ArrayList(value));
                                }
                            }
                            zzlVar.zze(r32, responseCode);
                            zzeedVar = zzeedVar3;
                        } catch (Throwable th3) {
                            th = th3;
                            r32.disconnect();
                            throw th;
                        }
                    } catch (zzdzd e4) {
                        e = e4;
                        zzeedVar = zzeedVar3;
                    }
                } catch (zzdzd e9) {
                    e = e9;
                    zzeedVar = zzeedVar2;
                } catch (Throwable th4) {
                    th = th4;
                }
                try {
                    zzeedVar.zza = responseCode;
                    zzeedVar.zzb = hashMap;
                    zzeedVar.zzc = "";
                    if (responseCode >= 200 && responseCode < 300) {
                        try {
                            InputStreamReader inputStreamReader2 = new InputStreamReader(r32.getInputStream());
                            try {
                                com.google.android.gms.ads.internal.zzu.zzp();
                                String zzN = com.google.android.gms.ads.internal.util.zzt.zzN(inputStreamReader2);
                                IOUtils.closeQuietly(inputStreamReader2);
                                zzlVar.zzg(zzN);
                                zzeedVar.zzc = zzN;
                                if (TextUtils.isEmpty(zzN)) {
                                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfB)).booleanValue()) {
                                        throw new zzdzd(3);
                                    }
                                }
                                zzeedVar.zzd = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - elapsedRealtime;
                            } catch (Throwable th5) {
                                th = th5;
                                inputStreamReader = inputStreamReader2;
                                IOUtils.closeQuietly(inputStreamReader);
                                throw th;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                        }
                    } else {
                        if (responseCode < 300 || responseCode >= 400) {
                            break;
                        }
                        String headerField = r32.getHeaderField("Location");
                        if (!TextUtils.isEmpty(headerField)) {
                            URL url2 = new URL(headerField);
                            i10 += r12 == true ? 1 : 0;
                            if (i10 <= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzeY)).intValue()) {
                                try {
                                    r32.disconnect();
                                    z8 = r12 == true ? 1 : 0;
                                    url = url2;
                                    zzeedVar2 = zzeedVar;
                                    zzeeeVar = this;
                                } catch (IOException e10) {
                                    e = e10;
                                    String concat = "Error while connecting to ad server: ".concat(String.valueOf(e.getMessage()));
                                    com.google.android.gms.ads.internal.util.client.zzm.zzj(concat);
                                    throw new zzdzd(r12, concat, e);
                                }
                            } else {
                                com.google.android.gms.ads.internal.util.client.zzm.zzj("Too many redirects.");
                                throw new zzdzd(r12 == true ? 1 : 0, "Too many redirects");
                            }
                        } else {
                            com.google.android.gms.ads.internal.util.client.zzm.zzj("No location header to follow redirect.");
                            throw new zzdzd(r12 == true ? 1 : 0, "No location header to follow redirect");
                        }
                    }
                } catch (zzdzd e11) {
                    e = e11;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzis)).booleanValue()) {
                        zzeedVar.zzd = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - elapsedRealtime;
                        r32.disconnect();
                        return zzeedVar;
                    }
                    throw e;
                }
            }
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Received error HTTP response code: " + responseCode);
            throw new zzdzd(r12 == true ? 1 : 0, "Received error HTTP response code: " + responseCode);
        } catch (IOException e12) {
            e = e12;
            r12 = z8;
        }
    }
}
