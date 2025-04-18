package org.objectweb.asm.commons;

import org.objectweb.asm.Label;

/* loaded from: classes.dex */
public interface TableSwitchGenerator {
    void generateCase(int i2, Label label);

    void generateDefault();
}
