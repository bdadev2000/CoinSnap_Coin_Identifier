package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.vd;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class zn extends ya {
    public static final Parcelable.Creator<zn> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f28374b;

    /* renamed from: c, reason: collision with root package name */
    public final String f28375c;

    /* loaded from: classes3.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public zn[] newArray(int i2) {
            return new zn[i2];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public zn createFromParcel(Parcel parcel) {
            return new zn(parcel);
        }
    }

    public zn(Parcel parcel) {
        super((String) xp.a((Object) parcel.readString()));
        this.f28374b = parcel.readString();
        this.f28375c = (String) xp.a((Object) parcel.readString());
    }

    private static List a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zn.class != obj.getClass()) {
            return false;
        }
        zn znVar = (zn) obj;
        return xp.a((Object) this.f28125a, (Object) znVar.f28125a) && xp.a((Object) this.f28374b, (Object) znVar.f28374b) && xp.a((Object) this.f28375c, (Object) znVar.f28375c);
    }

    public int hashCode() {
        int b2 = androidx.compose.foundation.text.input.a.b(this.f28125a, 527, 31);
        String str = this.f28374b;
        int hashCode = (b2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f28375c;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.applovin.impl.ya
    public String toString() {
        return this.f28125a + ": description=" + this.f28374b + ": value=" + this.f28375c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f28125a);
        parcel.writeString(this.f28374b);
        parcel.writeString(this.f28375c);
    }

    public zn(String str, String str2, String str3) {
        super(str);
        this.f28374b = str2;
        this.f28375c = str3;
    }

    @Override // com.applovin.impl.bf.b
    public void a(vd.b bVar) {
        String str = this.f28125a;
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c2 = 0;
                    break;
                }
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c2 = 1;
                    break;
                }
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c2 = 2;
                    break;
                }
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c2 = 3;
                    break;
                }
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c2 = 4;
                    break;
                }
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c2 = 5;
                    break;
                }
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c2 = 6;
                    break;
                }
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c2 = 7;
                    break;
                }
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c2 = '\b';
                    break;
                }
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c2 = '\t';
                    break;
                }
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c2 = '\n';
                    break;
                }
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c2 = 11;
                    break;
                }
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c2 = '\f';
                    break;
                }
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c2 = '\r';
                    break;
                }
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c2 = 14;
                    break;
                }
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c2 = 15;
                    break;
                }
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c2 = 16;
                    break;
                }
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c2 = 17;
                    break;
                }
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c2 = 18;
                    break;
                }
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c2 = 19;
                    break;
                }
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c2 = 20;
                    break;
                }
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c2 = 21;
                    break;
                }
                break;
        }
        try {
            switch (c2) {
                case 0:
                case '\n':
                    bVar.b(this.f28375c);
                    return;
                case 1:
                case 11:
                    bVar.e(this.f28375c);
                    return;
                case 2:
                case '\f':
                    bVar.d(Integer.valueOf(Integer.parseInt(this.f28375c.substring(2, 4)))).c(Integer.valueOf(Integer.parseInt(this.f28375c.substring(0, 2))));
                    return;
                case 3:
                case 17:
                    bVar.c(this.f28375c);
                    return;
                case 4:
                case 18:
                    bVar.a(this.f28375c);
                    return;
                case 5:
                case 19:
                    bVar.f(this.f28375c);
                    return;
                case 6:
                case 20:
                    String[] a2 = xp.a(this.f28375c, RemoteSettings.FORWARD_SLASH_STRING);
                    bVar.k(Integer.valueOf(Integer.parseInt(a2[0]))).j(a2.length > 1 ? Integer.valueOf(Integer.parseInt(a2[1])) : null);
                    return;
                case 7:
                case 16:
                    bVar.k(this.f28375c);
                    return;
                case '\b':
                case 15:
                    bVar.l(this.f28375c);
                    return;
                case '\t':
                case 21:
                    bVar.e(Integer.valueOf(Integer.parseInt(this.f28375c)));
                    return;
                case '\r':
                    List a3 = a(this.f28375c);
                    int size = a3.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size != 3) {
                                return;
                            } else {
                                bVar.c((Integer) a3.get(2));
                            }
                        }
                        bVar.d((Integer) a3.get(1));
                    }
                    bVar.e((Integer) a3.get(0));
                    return;
                case 14:
                    List a4 = a(this.f28375c);
                    int size2 = a4.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 != 3) {
                                return;
                            } else {
                                bVar.f((Integer) a4.get(2));
                            }
                        }
                        bVar.g((Integer) a4.get(1));
                    }
                    bVar.h((Integer) a4.get(0));
                    return;
                default:
                    return;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }
}
