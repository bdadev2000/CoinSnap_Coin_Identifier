package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.qd;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class ao extends ua {
    public static final Parcelable.Creator<ao> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f3778b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3779c;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ao[] newArray(int i10) {
            return new ao[i10];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ao createFromParcel(Parcel parcel) {
            return new ao(parcel);
        }
    }

    public ao(Parcel parcel) {
        super((String) yp.a((Object) parcel.readString()));
        this.f3778b = parcel.readString();
        this.f3779c = (String) yp.a((Object) parcel.readString());
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
        if (yp.a((Object) this.a, (Object) aoVar.a) && yp.a((Object) this.f3778b, (Object) aoVar.f3778b) && yp.a((Object) this.f3779c, (Object) aoVar.f3779c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int c10 = vd.e.c(this.a, 527, 31);
        String str = this.f3778b;
        int i11 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (c10 + i10) * 31;
        String str2 = this.f3779c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    @Override // com.applovin.impl.ua
    public String toString() {
        return this.a + ": description=" + this.f3778b + ": value=" + this.f3779c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.a);
        parcel.writeString(this.f3778b);
        parcel.writeString(this.f3779c);
    }

    public ao(String str, String str2, String str3) {
        super(str);
        this.f3778b = str2;
        this.f3779c = str3;
    }

    @Override // com.applovin.impl.we.b
    public void a(qd.b bVar) {
        String str = this.a;
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c10 = 0;
                    break;
                }
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c10 = 1;
                    break;
                }
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c10 = 2;
                    break;
                }
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c10 = 3;
                    break;
                }
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c10 = 4;
                    break;
                }
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c10 = 5;
                    break;
                }
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c10 = 6;
                    break;
                }
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c10 = 7;
                    break;
                }
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c10 = 11;
                    break;
                }
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c10 = 14;
                    break;
                }
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c10 = 15;
                    break;
                }
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c10 = 16;
                    break;
                }
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c10 = 17;
                    break;
                }
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c10 = 18;
                    break;
                }
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c10 = 19;
                    break;
                }
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c10 = 20;
                    break;
                }
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c10 = 21;
                    break;
                }
                break;
        }
        try {
            switch (c10) {
                case 0:
                case '\n':
                    bVar.b(this.f3779c);
                    return;
                case 1:
                case 11:
                    bVar.e(this.f3779c);
                    return;
                case 2:
                case '\f':
                    bVar.d(Integer.valueOf(Integer.parseInt(this.f3779c.substring(2, 4)))).c(Integer.valueOf(Integer.parseInt(this.f3779c.substring(0, 2))));
                    return;
                case 3:
                case 17:
                    bVar.c(this.f3779c);
                    return;
                case 4:
                case 18:
                    bVar.a(this.f3779c);
                    return;
                case 5:
                case 19:
                    bVar.f(this.f3779c);
                    return;
                case 6:
                case 20:
                    String[] a10 = yp.a(this.f3779c, "/");
                    bVar.k(Integer.valueOf(Integer.parseInt(a10[0]))).j(a10.length > 1 ? Integer.valueOf(Integer.parseInt(a10[1])) : null);
                    return;
                case 7:
                case 16:
                    bVar.k(this.f3779c);
                    return;
                case '\b':
                case 15:
                    bVar.l(this.f3779c);
                    return;
                case '\t':
                case 21:
                    bVar.e(Integer.valueOf(Integer.parseInt(this.f3779c)));
                    return;
                case '\r':
                    List a11 = a(this.f3779c);
                    int size = a11.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size != 3) {
                                return;
                            } else {
                                bVar.c((Integer) a11.get(2));
                            }
                        }
                        bVar.d((Integer) a11.get(1));
                    }
                    bVar.e((Integer) a11.get(0));
                    return;
                case 14:
                    List a12 = a(this.f3779c);
                    int size2 = a12.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 != 3) {
                                return;
                            } else {
                                bVar.f((Integer) a12.get(2));
                            }
                        }
                        bVar.g((Integer) a12.get(1));
                    }
                    bVar.h((Integer) a12.get(0));
                    return;
                default:
                    return;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }
}
