package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzfhs {
    private final zzaxd zza;

    public zzfhs(zzaxd zzaxdVar) {
        this.zza = zzaxdVar;
    }

    private static final Uri zzb(Uri uri, String str) throws zzaxe {
        if (uri != null) {
            try {
                try {
                    String host = uri.getHost();
                    String path = uri.getPath();
                    if (host != null && host.equals("ad.doubleclick.net") && path != null) {
                        if (path.contains(";")) {
                            if (!uri.toString().contains("dc_ms=")) {
                                String uri2 = uri.toString();
                                int indexOf = uri2.indexOf(";adurl");
                                if (indexOf != -1) {
                                    int i9 = indexOf + 1;
                                    StringBuilder sb = new StringBuilder(uri2.substring(0, i9));
                                    sb.append("dc_ms=");
                                    sb.append(str);
                                    sb.append(";");
                                    sb.append((CharSequence) uri2, i9, uri2.length());
                                    return Uri.parse(sb.toString());
                                }
                                String encodedPath = uri.getEncodedPath();
                                if (encodedPath != null) {
                                    int indexOf2 = uri2.indexOf(encodedPath);
                                    StringBuilder sb2 = new StringBuilder(uri2.substring(0, encodedPath.length() + indexOf2));
                                    sb2.append(";dc_ms=");
                                    sb2.append(str);
                                    sb2.append(";");
                                    sb2.append((CharSequence) uri2, indexOf2 + encodedPath.length(), uri2.length());
                                    return Uri.parse(sb2.toString());
                                }
                                throw new UnsupportedOperationException();
                            }
                            throw new zzaxe("Parameter already exists: dc_ms");
                        }
                    }
                } catch (NullPointerException unused) {
                }
            } catch (UnsupportedOperationException unused2) {
                throw new zzaxe("Provided Uri is not in a valid state");
            }
        }
        if (uri.getQueryParameter("ms") == null) {
            String uri3 = uri.toString();
            int indexOf3 = uri3.indexOf("&adurl");
            if (indexOf3 == -1) {
                indexOf3 = uri3.indexOf("?adurl");
            }
            if (indexOf3 != -1) {
                int i10 = indexOf3 + 1;
                StringBuilder sb3 = new StringBuilder(uri3.substring(0, i10));
                sb3.append("ms=");
                sb3.append(str);
                sb3.append("&");
                sb3.append((CharSequence) uri3, i10, uri3.length());
                return Uri.parse(sb3.toString());
            }
            return uri.buildUpon().appendQueryParameter("ms", str).build();
        }
        throw new zzaxe("Query parameter already exists: ms");
    }

    public final Uri zza(Uri uri, Context context, View view, @Nullable Activity activity) throws zzaxe {
        try {
            return zzb(uri, this.zza.zzc().zzf(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new zzaxe("Provided Uri is not in a valid state");
        }
    }
}
