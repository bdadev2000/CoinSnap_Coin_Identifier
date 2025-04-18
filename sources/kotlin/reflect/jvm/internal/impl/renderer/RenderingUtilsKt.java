package kotlin.reflect.jvm.internal.impl.renderer;

import eb.j;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.text.StringsKt;

@SourceDebugExtension({"SMAP\nRenderingUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderingUtils.kt\norg/jetbrains/kotlin/renderer/RenderingUtilsKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,75:1\n1083#2,2:76\n*S KotlinDebug\n*F\n+ 1 RenderingUtils.kt\norg/jetbrains/kotlin/renderer/RenderingUtilsKt\n*L\n29#1:76,2\n*E\n"})
/* loaded from: classes4.dex */
public final class RenderingUtilsKt {
    public static final String render(Name name) {
        Intrinsics.checkNotNullParameter(name, "<this>");
        if (!shouldBeEscaped(name)) {
            String asString = name.asString();
            Intrinsics.checkNotNullExpressionValue(asString, "asString()");
            return asString;
        }
        StringBuilder sb2 = new StringBuilder();
        String asString2 = name.asString();
        Intrinsics.checkNotNullExpressionValue(asString2, "asString()");
        sb2.append("`" + asString2);
        sb2.append('`');
        return sb2.toString();
    }

    public static final String renderFqName(List<Name> pathSegments) {
        Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        StringBuilder sb2 = new StringBuilder();
        for (Name name : pathSegments) {
            if (sb2.length() > 0) {
                sb2.append(".");
            }
            sb2.append(render(name));
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public static final String replacePrefixesInTypeRepresentations(String lowerRendered, String lowerPrefix, String upperRendered, String upperPrefix, String foldedPrefix) {
        Intrinsics.checkNotNullParameter(lowerRendered, "lowerRendered");
        Intrinsics.checkNotNullParameter(lowerPrefix, "lowerPrefix");
        Intrinsics.checkNotNullParameter(upperRendered, "upperRendered");
        Intrinsics.checkNotNullParameter(upperPrefix, "upperPrefix");
        Intrinsics.checkNotNullParameter(foldedPrefix, "foldedPrefix");
        if (StringsKt.z(lowerRendered, lowerPrefix) && StringsKt.z(upperRendered, upperPrefix)) {
            String substring = lowerRendered.substring(lowerPrefix.length());
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
            String substring2 = upperRendered.substring(upperPrefix.length());
            Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
            String k10 = j.k(foldedPrefix, substring);
            if (Intrinsics.areEqual(substring, substring2)) {
                return k10;
            }
            if (typeStringsDifferOnlyInNullability(substring, substring2)) {
                return k10 + '!';
            }
            return null;
        }
        return null;
    }

    private static final boolean shouldBeEscaped(Name name) {
        boolean z10;
        boolean z11;
        String asString = name.asString();
        Intrinsics.checkNotNullExpressionValue(asString, "asString()");
        if (KeywordStringsGenerated.KEYWORDS.contains(asString)) {
            return true;
        }
        int i10 = 0;
        while (true) {
            if (i10 < asString.length()) {
                char charAt = asString.charAt(i10);
                if (!Character.isLetterOrDigit(charAt) && charAt != '_') {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    z10 = true;
                    break;
                }
                i10++;
            } else {
                z10 = false;
                break;
            }
        }
        if (z10) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0033, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r2 + '?', r3) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean typeStringsDifferOnlyInNullability(java.lang.String r2, java.lang.String r3) {
        /*
            java.lang.String r0 = "lower"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "upper"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = ""
            java.lang.String r1 = "?"
            java.lang.String r0 = kotlin.text.StringsKt.s(r3, r1, r0)
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
            if (r0 != 0) goto L51
            boolean r0 = kotlin.text.StringsKt.h(r3, r1)
            if (r0 == 0) goto L35
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r1 = 63
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r0 != 0) goto L51
        L35:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "("
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r2 = ")?"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            if (r2 == 0) goto L4f
            goto L51
        L4f:
            r2 = 0
            goto L52
        L51:
            r2 = 1
        L52:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.RenderingUtilsKt.typeStringsDifferOnlyInNullability(java.lang.String, java.lang.String):boolean");
    }

    public static final String render(FqNameUnsafe fqNameUnsafe) {
        Intrinsics.checkNotNullParameter(fqNameUnsafe, "<this>");
        List<Name> pathSegments = fqNameUnsafe.pathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "pathSegments()");
        return renderFqName(pathSegments);
    }
}
