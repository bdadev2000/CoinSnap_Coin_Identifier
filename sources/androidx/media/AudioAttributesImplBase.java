package androidx.media;

import android.support.v4.media.d;
import java.util.Arrays;

/* loaded from: classes4.dex */
class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a, reason: collision with root package name */
    public int f20287a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f20288b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f20289c = 0;
    public int d = -1;

    public final boolean equals(Object obj) {
        int i2;
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f20288b != audioAttributesImplBase.f20288b) {
            return false;
        }
        int i3 = this.f20289c;
        int i4 = audioAttributesImplBase.f20289c;
        int i5 = audioAttributesImplBase.d;
        if (i5 == -1) {
            int i6 = audioAttributesImplBase.f20287a;
            int i7 = AudioAttributesCompat.f20283b;
            if ((i4 & 1) != 1) {
                i2 = 4;
                if ((i4 & 4) != 4) {
                    switch (i6) {
                        case 2:
                            i2 = 0;
                            break;
                        case 3:
                            i2 = 8;
                            break;
                        case 4:
                            break;
                        case 5:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                            i2 = 5;
                            break;
                        case 6:
                            i2 = 2;
                            break;
                        case 11:
                            i2 = 10;
                            break;
                        case 12:
                        default:
                            i2 = 3;
                            break;
                        case 13:
                            i2 = 1;
                            break;
                    }
                } else {
                    i2 = 6;
                }
            } else {
                i2 = 7;
            }
        } else {
            i2 = i5;
        }
        if (i2 == 6) {
            i4 |= 4;
        } else if (i2 == 7) {
            i4 |= 1;
        }
        return i3 == (i4 & 273) && this.f20287a == audioAttributesImplBase.f20287a && this.d == i5;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f20288b), Integer.valueOf(this.f20289c), Integer.valueOf(this.f20287a), Integer.valueOf(this.d)});
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.d != -1) {
            sb.append(" stream=");
            sb.append(this.d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        int i2 = this.f20287a;
        int i3 = AudioAttributesCompat.f20283b;
        switch (i2) {
            case 0:
                str = "USAGE_UNKNOWN";
                break;
            case 1:
                str = "USAGE_MEDIA";
                break;
            case 2:
                str = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                str = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                str = "USAGE_ALARM";
                break;
            case 5:
                str = "USAGE_NOTIFICATION";
                break;
            case 6:
                str = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                str = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                str = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                str = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                str = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                str = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                str = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                str = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                str = "USAGE_GAME";
                break;
            case 15:
            default:
                str = d.i("unknown usage ", i2);
                break;
            case 16:
                str = "USAGE_ASSISTANT";
                break;
        }
        sb.append(str);
        sb.append(" content=");
        sb.append(this.f20288b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f20289c).toUpperCase());
        return sb.toString();
    }
}
