package g0;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class r extends v3.c {
    /* JADX WARN: Incorrect condition in loop: B:9:0x0028 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.fonts.Font F(android.graphics.fonts.FontFamily r5, int r6) {
        /*
            g0.b.y()
            r0 = r6 & 1
            if (r0 == 0) goto La
            r0 = 700(0x2bc, float:9.81E-43)
            goto Lc
        La:
            r0 = 400(0x190, float:5.6E-43)
        Lc:
            r6 = r6 & 2
            r1 = 1
            if (r6 == 0) goto L13
            r6 = r1
            goto L14
        L13:
            r6 = 0
        L14:
            android.graphics.fonts.FontStyle r6 = g0.b.m(r0, r6)
            android.graphics.fonts.Font r0 = g0.b.j(r5)
            android.graphics.fonts.FontStyle r2 = g0.q.h(r0)
            int r2 = G(r6, r2)
        L24:
            int r3 = g0.b.b(r5)
            if (r1 >= r3) goto L3d
            android.graphics.fonts.Font r3 = g0.b.k(r5, r1)
            android.graphics.fonts.FontStyle r4 = g0.q.h(r3)
            int r4 = G(r6, r4)
            if (r4 >= r2) goto L3a
            r0 = r3
            r2 = r4
        L3a:
            int r1 = r1 + 1
            goto L24
        L3d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.r.F(android.graphics.fonts.FontFamily, int):android.graphics.fonts.Font");
    }

    public static int G(FontStyle fontStyle, FontStyle fontStyle2) {
        int weight;
        int weight2;
        int slant;
        int slant2;
        int i10;
        weight = fontStyle.getWeight();
        weight2 = fontStyle2.getWeight();
        int abs = Math.abs(weight - weight2) / 100;
        slant = fontStyle.getSlant();
        slant2 = fontStyle2.getSlant();
        if (slant == slant2) {
            i10 = 0;
        } else {
            i10 = 2;
        }
        return abs + i10;
    }

    @Override // v3.c
    public final k0.h C(int i10, k0.h[] hVarArr) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // v3.c
    public final Typeface v(Context context, f0.f fVar, Resources resources, int i10) {
        FontFamily build;
        FontStyle style;
        Typeface.CustomFallbackBuilder style2;
        Typeface build2;
        Font.Builder weight;
        int i11;
        Font.Builder slant;
        Font.Builder ttcIndex;
        Font.Builder fontVariationSettings;
        Font build3;
        try {
            FontFamily.Builder builder = null;
            for (f0.g gVar : fVar.a) {
                try {
                    b.n();
                    weight = b.g(resources, gVar.f17522f).setWeight(gVar.f17518b);
                    if (gVar.f17519c) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    slant = weight.setSlant(i11);
                    ttcIndex = slant.setTtcIndex(gVar.f17521e);
                    fontVariationSettings = ttcIndex.setFontVariationSettings(gVar.f17520d);
                    build3 = fontVariationSettings.build();
                    if (builder == null) {
                        b.s();
                        builder = b.l(build3);
                    } else {
                        builder.addFont(build3);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            build = builder.build();
            b.v();
            Typeface.CustomFallbackBuilder f10 = b.f(build);
            style = F(build, i10).getStyle();
            style2 = f10.setStyle(style);
            build2 = style2.build();
            return build2;
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // v3.c
    public final Typeface w(Context context, k0.h[] hVarArr, int i10) {
        FontFamily build;
        FontStyle style;
        Typeface.CustomFallbackBuilder style2;
        Typeface build2;
        ParcelFileDescriptor openFileDescriptor;
        Font.Builder weight;
        int i11;
        Font.Builder slant;
        Font.Builder ttcIndex;
        Font build3;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (k0.h hVar : hVarArr) {
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(hVar.a, CampaignEx.JSON_KEY_AD_R, null);
                } catch (IOException unused) {
                }
                if (openFileDescriptor == null) {
                    if (openFileDescriptor == null) {
                    }
                } else {
                    try {
                        b.n();
                        weight = b.i(openFileDescriptor).setWeight(hVar.f20205c);
                        if (hVar.f20206d) {
                            i11 = 1;
                        } else {
                            i11 = 0;
                        }
                        slant = weight.setSlant(i11);
                        ttcIndex = slant.setTtcIndex(hVar.f20204b);
                        build3 = ttcIndex.build();
                        if (builder == null) {
                            b.s();
                            builder = b.l(build3);
                        } else {
                            builder.addFont(build3);
                        }
                    } catch (Throwable th2) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                        break;
                    }
                }
                openFileDescriptor.close();
            }
            if (builder == null) {
                return null;
            }
            build = builder.build();
            b.v();
            Typeface.CustomFallbackBuilder f10 = b.f(build);
            style = F(build, i10).getStyle();
            style2 = f10.setStyle(style);
            build2 = style2.build();
            return build2;
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // v3.c
    public final Typeface x(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // v3.c
    public final Typeface y(Context context, Resources resources, int i10, String str, int i11) {
        Font build;
        FontFamily build2;
        FontStyle style;
        Typeface.CustomFallbackBuilder style2;
        Typeface build3;
        try {
            b.n();
            build = b.g(resources, i10).build();
            b.s();
            build2 = b.l(build).build();
            b.v();
            Typeface.CustomFallbackBuilder f10 = b.f(build2);
            style = build.getStyle();
            style2 = f10.setStyle(style);
            build3 = style2.build();
            return build3;
        } catch (Exception unused) {
            return null;
        }
    }
}
