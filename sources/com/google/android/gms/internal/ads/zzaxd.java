package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes2.dex */
public final class zzaxd {
    private static final String[] zza = {"/aclk", "/pcs/click", "/dbm/clk"};
    private final String zzb = "ad.doubleclick.net";
    private final String[] zzc = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
    private final zzawz zzd;

    @Deprecated
    public zzaxd(zzawz zzawzVar) {
        this.zzd = zzawzVar;
    }

    private final Uri zzg(Uri uri, String str) throws zzaxe {
        uri.getClass();
        try {
            try {
                if (uri.getHost().equals(this.zzb)) {
                    if (uri.getPath().contains(";")) {
                        if (!uri.toString().contains("dc_ms=")) {
                            String uri2 = uri.toString();
                            int indexOf = uri2.indexOf(";adurl");
                            if (indexOf != -1) {
                                int i9 = indexOf + 1;
                                return Uri.parse(uri2.substring(0, i9) + "dc_ms=" + str + ";" + uri2.substring(i9));
                            }
                            String encodedPath = uri.getEncodedPath();
                            int indexOf2 = uri2.indexOf(encodedPath);
                            return Uri.parse(uri2.substring(0, encodedPath.length() + indexOf2) + ";dc_ms=" + str + ";" + uri2.substring(indexOf2 + encodedPath.length()));
                        }
                        throw new zzaxe("Parameter already exists: dc_ms");
                    }
                }
            } catch (UnsupportedOperationException unused) {
                throw new zzaxe("Provided Uri is not in a valid state");
            }
        } catch (NullPointerException unused2) {
        }
        if (uri.getQueryParameter("ms") == null) {
            String uri3 = uri.toString();
            int indexOf3 = uri3.indexOf("&adurl");
            if (indexOf3 == -1) {
                indexOf3 = uri3.indexOf("?adurl");
            }
            if (indexOf3 != -1) {
                int i10 = indexOf3 + 1;
                return Uri.parse(uri3.substring(0, i10) + "ms=" + str + "&" + uri3.substring(i10));
            }
            return uri.buildUpon().appendQueryParameter("ms", str).build();
        }
        throw new zzaxe("Query parameter already exists: ms");
    }

    @Deprecated
    public final Uri zza(Uri uri, Context context, View view, Activity activity) throws zzaxe {
        try {
            return zzg(uri, this.zzd.zzf(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new zzaxe("Provided Uri is not in a valid state");
        }
    }

    @Deprecated
    public final Uri zzb(Uri uri, Context context) throws zzaxe {
        return zzg(uri, this.zzd.zzg(context));
    }

    @Deprecated
    public final zzawz zzc() {
        return this.zzd;
    }

    @Deprecated
    public final void zzd(MotionEvent motionEvent) {
        this.zzd.zzk(motionEvent);
    }

    public final boolean zze(Uri uri) {
        if (zzf(uri)) {
            String[] strArr = zza;
            for (int i9 = 0; i9 < 3; i9++) {
                if (uri.getPath().endsWith(strArr[i9])) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean zzf(Uri uri) {
        uri.getClass();
        try {
            String host = uri.getHost();
            String[] strArr = this.zzc;
            for (int i9 = 0; i9 < 3; i9++) {
                if (host.endsWith(strArr[i9])) {
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }
}
