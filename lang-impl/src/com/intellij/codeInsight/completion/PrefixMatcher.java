/*
 * Copyright (c) 2008 Your Corporation. All Rights Reserved.
 */
package com.intellij.codeInsight.completion;

import com.intellij.codeInsight.lookup.LookupElement;
import org.jetbrains.annotations.NotNull;

/**
 * @author peter
 */
public abstract class PrefixMatcher {

  public abstract boolean prefixMatches(@NotNull LookupElement element);

  public abstract boolean prefixMatches(@NotNull String name);

  @NotNull
  public abstract String getPrefix();
}
