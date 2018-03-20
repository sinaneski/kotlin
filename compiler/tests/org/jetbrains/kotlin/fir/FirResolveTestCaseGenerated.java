/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.fir;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/fir/resolve")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class FirResolveTestCaseGenerated extends AbstractFirResolveTestCase {
    public void testAllFilesPresentInResolve() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/fir/resolve"), Pattern.compile("^([^.]+)\\.kt$"), TargetBackend.ANY, true);
    }

    @TestMetadata("F.kt")
    public void testF() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/fir/resolve/F.kt");
        doTest(fileName);
    }

    @TestMetadata("NestedSuperType.kt")
    public void testNestedSuperType() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/fir/resolve/NestedSuperType.kt");
        doTest(fileName);
    }

    @TestMetadata("TwoDeclarationsInSameFile.kt")
    public void testTwoDeclarationsInSameFile() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/fir/resolve/TwoDeclarationsInSameFile.kt");
        doTest(fileName);
    }

    @TestMetadata("compiler/testData/fir/resolve/multifile")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Multifile extends AbstractFirResolveTestCase {
        public void testAllFilesPresentInMultifile() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/fir/resolve/multifile"), Pattern.compile("^([^.]+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("simpleAliasedImport.kt")
        public void testSimpleAliasedImport() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/fir/resolve/multifile/simpleAliasedImport.kt");
            doTest(fileName);
        }

        @TestMetadata("simpleImport.kt")
        public void testSimpleImport() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/fir/resolve/multifile/simpleImport.kt");
            doTest(fileName);
        }

        @TestMetadata("simpleImportNested.kt")
        public void testSimpleImportNested() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/fir/resolve/multifile/simpleImportNested.kt");
            doTest(fileName);
        }

        @TestMetadata("simpleImportOuter.kt")
        public void testSimpleImportOuter() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/fir/resolve/multifile/simpleImportOuter.kt");
            doTest(fileName);
        }
    }
}
