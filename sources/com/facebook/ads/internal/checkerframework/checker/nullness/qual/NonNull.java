package com.facebook.ads.internal.checkerframework.checker.nullness.qual;

import com.facebook.ads.internal.checkerframework.framework.qual.DefaultFor;
import com.facebook.ads.internal.checkerframework.framework.qual.DefaultInUncheckedCodeFor;
import com.facebook.ads.internal.checkerframework.framework.qual.DefaultQualifierInHierarchy;
import com.facebook.ads.internal.checkerframework.framework.qual.QualifierForLiterals;
import com.facebook.ads.internal.checkerframework.framework.qual.SubtypeOf;
import com.facebook.ads.internal.checkerframework.framework.qual.UpperBoundFor;
import com.instagram.common.viewpoint.core.C7M;
import com.instagram.common.viewpoint.core.EnumC03387a;
import com.instagram.common.viewpoint.core.EnumC03397b;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@SubtypeOf({MonotonicNonNull.class})
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@UpperBoundFor(typeKinds = {EnumC03387a.A0H, EnumC03387a.A0B, EnumC03387a.A03, EnumC03387a.A05, EnumC03387a.A07, EnumC03387a.A0A, EnumC03387a.A0D, EnumC03387a.A0I, EnumC03387a.A04})
@Retention(RetentionPolicy.RUNTIME)
@QualifierForLiterals({C7M.A0C})
@DefaultFor({EnumC03397b.A05})
@DefaultQualifierInHierarchy
@DefaultInUncheckedCodeFor({EnumC03397b.A0E, EnumC03397b.A0C})
@Documented
/* loaded from: assets/audience_network.dex */
public @interface NonNull {
}
