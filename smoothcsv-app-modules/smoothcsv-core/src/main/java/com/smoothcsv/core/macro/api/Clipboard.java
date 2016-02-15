/*
 * Copyright 2015 kohii.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.smoothcsv.core.macro.api;

/**
 * @author kohii
 *
 */
public interface Clipboard {

  /**
   * Returns the content in the clipboard as plain text.
   *
   * @return the content in the clipboard
   */
  String readText();

  /**
   * Writes the text into the clipboard as plain text.
   *
   * @param text the text
   */
  void writeText(String text);
}