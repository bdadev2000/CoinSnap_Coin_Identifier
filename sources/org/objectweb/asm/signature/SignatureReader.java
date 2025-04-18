package org.objectweb.asm.signature;

import org.objectweb.asm.TypeReference;

/* loaded from: classes.dex */
public class SignatureReader {
    private final String signatureValue;

    public SignatureReader(String str) {
        this.signatureValue = str;
    }

    private static int parseType(String str, int i2, SignatureVisitor signatureVisitor) {
        int i3;
        char charAt;
        int i4 = i2 + 1;
        char charAt2 = str.charAt(i2);
        if (charAt2 != 'F') {
            if (charAt2 == 'L') {
                boolean z2 = false;
                boolean z3 = false;
                while (true) {
                    int i5 = i4;
                    while (true) {
                        i3 = i4 + 1;
                        charAt = str.charAt(i4);
                        if (charAt == '.' || charAt == ';') {
                            break;
                        }
                        if (charAt == '<') {
                            String substring = str.substring(i5, i4);
                            if (z3) {
                                signatureVisitor.visitInnerClassType(substring);
                            } else {
                                signatureVisitor.visitClassType(substring);
                            }
                            i4 = i3;
                            while (true) {
                                char charAt3 = str.charAt(i4);
                                if (charAt3 == '>') {
                                    break;
                                }
                                if (charAt3 != '*') {
                                    i4 = (charAt3 == '+' || charAt3 == '-') ? parseType(str, i4 + 1, signatureVisitor.visitTypeArgument(charAt3)) : parseType(str, i4, signatureVisitor.visitTypeArgument(SignatureVisitor.INSTANCEOF));
                                } else {
                                    i4++;
                                    signatureVisitor.visitTypeArgument();
                                }
                            }
                            z2 = true;
                        } else {
                            i4 = i3;
                        }
                    }
                    if (!z2) {
                        String substring2 = str.substring(i5, i4);
                        if (z3) {
                            signatureVisitor.visitInnerClassType(substring2);
                        } else {
                            signatureVisitor.visitClassType(substring2);
                        }
                    }
                    if (charAt == ';') {
                        signatureVisitor.visitEnd();
                        return i3;
                    }
                    z2 = false;
                    z3 = true;
                    i4 = i3;
                }
            } else if (charAt2 != 'V' && charAt2 != 'I' && charAt2 != 'J' && charAt2 != 'S') {
                if (charAt2 == 'T') {
                    int indexOf = str.indexOf(59, i4);
                    signatureVisitor.visitTypeVariable(str.substring(i4, indexOf));
                    return indexOf + 1;
                }
                if (charAt2 != 'Z') {
                    if (charAt2 == '[') {
                        return parseType(str, i4, signatureVisitor.visitArrayType());
                    }
                    switch (charAt2) {
                        case TypeReference.EXCEPTION_PARAMETER /* 66 */:
                        case TypeReference.INSTANCEOF /* 67 */:
                        case TypeReference.NEW /* 68 */:
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
                }
            }
        }
        signatureVisitor.visitBaseType(charAt2);
        return i4;
    }

    public void accept(SignatureVisitor signatureVisitor) {
        char charAt;
        String str = this.signatureValue;
        int length = str.length();
        int i2 = 0;
        if (str.charAt(0) == '<') {
            i2 = 2;
            do {
                int indexOf = str.indexOf(58, i2);
                signatureVisitor.visitFormalTypeParameter(str.substring(i2 - 1, indexOf));
                int i3 = indexOf + 1;
                char charAt2 = str.charAt(i3);
                if (charAt2 == 'L' || charAt2 == '[' || charAt2 == 'T') {
                    i3 = parseType(str, i3, signatureVisitor.visitClassBound());
                }
                while (true) {
                    i2 = i3 + 1;
                    charAt = str.charAt(i3);
                    if (charAt != ':') {
                        break;
                    } else {
                        i3 = parseType(str, i2, signatureVisitor.visitInterfaceBound());
                    }
                }
            } while (charAt != '>');
        }
        if (str.charAt(i2) != '(') {
            int parseType = parseType(str, i2, signatureVisitor.visitSuperclass());
            while (parseType < length) {
                parseType = parseType(str, parseType, signatureVisitor.visitInterface());
            }
        } else {
            int i4 = i2 + 1;
            while (str.charAt(i4) != ')') {
                i4 = parseType(str, i4, signatureVisitor.visitParameterType());
            }
            int parseType2 = parseType(str, i4 + 1, signatureVisitor.visitReturnType());
            while (parseType2 < length) {
                parseType2 = parseType(str, parseType2 + 1, signatureVisitor.visitExceptionType());
            }
        }
    }

    public void acceptType(SignatureVisitor signatureVisitor) {
        parseType(this.signatureValue, 0, signatureVisitor);
    }
}
