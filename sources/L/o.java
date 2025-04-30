package L;

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
public final class o extends android.support.v4.media.session.a {
    public static Font y(FontFamily fontFamily, int i9) {
        int i10;
        int i11;
        if ((i9 & 1) != 0) {
            i10 = 700;
        } else {
            i10 = 400;
        }
        if ((i9 & 2) != 0) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        FontStyle fontStyle = new FontStyle(i10, i11);
        Font font = fontFamily.getFont(0);
        int z8 = z(fontStyle, font.getStyle());
        for (int i12 = 1; i12 < fontFamily.getSize(); i12++) {
            Font font2 = fontFamily.getFont(i12);
            int z9 = z(fontStyle, font2.getStyle());
            if (z9 < z8) {
                font = font2;
                z8 = z9;
            }
        }
        return font;
    }

    public static int z(FontStyle fontStyle, FontStyle fontStyle2) {
        int i9;
        int abs = Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100;
        if (fontStyle.getSlant() == fontStyle2.getSlant()) {
            i9 = 0;
        } else {
            i9 = 2;
        }
        return abs + i9;
    }

    @Override // android.support.v4.media.session.a
    public final Typeface h(Context context, K.f fVar, Resources resources, int i9) {
        try {
            FontFamily.Builder builder = null;
            for (K.g gVar : fVar.f1618a) {
                try {
                    Font build = new Font.Builder(resources, gVar.f1623f).setWeight(gVar.b).setSlant(gVar.f1620c ? 1 : 0).setTtcIndex(gVar.f1622e).setFontVariationSettings(gVar.f1621d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(y(build2, i9).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // android.support.v4.media.session.a
    public final Typeface i(Context context, Q.g[] gVarArr, int i9) {
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (Q.g gVar : gVarArr) {
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(gVar.f2461a, CampaignEx.JSON_KEY_AD_R, null);
                } catch (IOException unused) {
                }
                if (openFileDescriptor == null) {
                    if (openFileDescriptor == null) {
                    }
                } else {
                    try {
                        Font build = new Font.Builder(openFileDescriptor).setWeight(gVar.f2462c).setSlant(gVar.f2463d ? 1 : 0).setTtcIndex(gVar.b).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                    } catch (Throwable th) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                        break;
                    }
                }
                openFileDescriptor.close();
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(y(build2, i9).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // android.support.v4.media.session.a
    public final Typeface j(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // android.support.v4.media.session.a
    public final Typeface k(Context context, Resources resources, int i9, String str, int i10) {
        try {
            Font build = new Font.Builder(resources, i9).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.support.v4.media.session.a
    public final Q.g o(Q.g[] gVarArr, int i9) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
