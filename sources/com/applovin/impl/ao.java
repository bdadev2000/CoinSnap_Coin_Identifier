package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.qd;
import java.util.ArrayList;
import java.util.List;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public final class ao extends ua {
    public static final Parcelable.Creator<ao> CREATOR = new a();
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6772c;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ao[] newArray(int i9) {
            return new ao[i9];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ao createFromParcel(Parcel parcel) {
            return new ao(parcel);
        }
    }

    public ao(Parcel parcel) {
        super((String) yp.a((Object) parcel.readString()));
        this.b = parcel.readString();
        this.f6772c = (String) yp.a((Object) parcel.readString());
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
        if (obj == null || ao.class != obj.getClass()) {
            return false;
        }
        ao aoVar = (ao) obj;
        if (yp.a((Object) this.f11577a, (Object) aoVar.f11577a) && yp.a((Object) this.b, (Object) aoVar.b) && yp.a((Object) this.f6772c, (Object) aoVar.f6772c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i9;
        int b = AbstractC2914a.b(527, 31, this.f11577a);
        String str = this.b;
        int i10 = 0;
        if (str != null) {
            i9 = str.hashCode();
        } else {
            i9 = 0;
        }
        int i11 = (b + i9) * 31;
        String str2 = this.f6772c;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return i11 + i10;
    }

    @Override // com.applovin.impl.ua
    public String toString() {
        return this.f11577a + ": description=" + this.b + ": value=" + this.f6772c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f11577a);
        parcel.writeString(this.b);
        parcel.writeString(this.f6772c);
    }

    public ao(String str, String str2, String str3) {
        super(str);
        this.b = str2;
        this.f6772c = str3;
    }

    @Override // com.applovin.impl.we.b
    public void a(qd.b bVar) {
        String str = this.f11577a;
        str.getClass();
        char c9 = 65535;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c9 = 0;
                    break;
                }
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c9 = 1;
                    break;
                }
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c9 = 2;
                    break;
                }
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c9 = 3;
                    break;
                }
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c9 = 4;
                    break;
                }
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c9 = 5;
                    break;
                }
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c9 = 6;
                    break;
                }
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c9 = 7;
                    break;
                }
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c9 = '\b';
                    break;
                }
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c9 = '\t';
                    break;
                }
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c9 = '\n';
                    break;
                }
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c9 = 11;
                    break;
                }
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c9 = '\f';
                    break;
                }
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c9 = '\r';
                    break;
                }
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c9 = 14;
                    break;
                }
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c9 = 15;
                    break;
                }
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c9 = 16;
                    break;
                }
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c9 = 17;
                    break;
                }
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c9 = 18;
                    break;
                }
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c9 = 19;
                    break;
                }
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c9 = 20;
                    break;
                }
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c9 = 21;
                    break;
                }
                break;
        }
        try {
            switch (c9) {
                case 0:
                case '\n':
                    bVar.b(this.f6772c);
                    return;
                case 1:
                case 11:
                    bVar.e(this.f6772c);
                    return;
                case 2:
                case '\f':
                    bVar.d(Integer.valueOf(Integer.parseInt(this.f6772c.substring(2, 4)))).c(Integer.valueOf(Integer.parseInt(this.f6772c.substring(0, 2))));
                    return;
                case 3:
                case 17:
                    bVar.c(this.f6772c);
                    return;
                case 4:
                case 18:
                    bVar.a(this.f6772c);
                    return;
                case 5:
                case 19:
                    bVar.f(this.f6772c);
                    return;
                case 6:
                case 20:
                    String[] a6 = yp.a(this.f6772c, "/");
                    bVar.k(Integer.valueOf(Integer.parseInt(a6[0]))).j(a6.length > 1 ? Integer.valueOf(Integer.parseInt(a6[1])) : null);
                    return;
                case 7:
                case 16:
                    bVar.k(this.f6772c);
                    return;
                case '\b':
                case 15:
                    bVar.l(this.f6772c);
                    return;
                case '\t':
                case 21:
                    bVar.e(Integer.valueOf(Integer.parseInt(this.f6772c)));
                    return;
                case '\r':
                    List a9 = a(this.f6772c);
                    int size = a9.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size != 3) {
                                return;
                            } else {
                                bVar.c((Integer) a9.get(2));
                            }
                        }
                        bVar.d((Integer) a9.get(1));
                    }
                    bVar.e((Integer) a9.get(0));
                    return;
                case 14:
                    List a10 = a(this.f6772c);
                    int size2 = a10.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 != 3) {
                                return;
                            } else {
                                bVar.f((Integer) a10.get(2));
                            }
                        }
                        bVar.g((Integer) a10.get(1));
                    }
                    bVar.h((Integer) a10.get(0));
                    return;
                default:
                    return;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }
}
