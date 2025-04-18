package androidx.datastore.preferences.protobuf;

/* loaded from: classes4.dex */
final class TextFormatEscaper {

    /* renamed from: androidx.datastore.preferences.protobuf.TextFormatEscaper$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    final class AnonymousClass1 implements ByteSequence {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ByteString f19377a;

        public AnonymousClass1(ByteString byteString) {
            this.f19377a = byteString;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.TextFormatEscaper$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    final class AnonymousClass2 implements ByteSequence {
    }

    /* loaded from: classes4.dex */
    public interface ByteSequence {
    }

    public static String a(ByteString byteString) {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(byteString);
        StringBuilder sb = new StringBuilder(byteString.size());
        int i2 = 0;
        while (true) {
            ByteString byteString2 = anonymousClass1.f19377a;
            if (i2 >= byteString2.size()) {
                return sb.toString();
            }
            byte b2 = byteString2.b(i2);
            if (b2 == 34) {
                sb.append("\\\"");
            } else if (b2 == 39) {
                sb.append("\\'");
            } else if (b2 != 92) {
                switch (b2) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (b2 >= 32 && b2 <= 126) {
                            sb.append((char) b2);
                            break;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((b2 >>> 6) & 3) + 48));
                            sb.append((char) (((b2 >>> 3) & 7) + 48));
                            sb.append((char) ((b2 & 7) + 48));
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
            i2++;
        }
    }
}
